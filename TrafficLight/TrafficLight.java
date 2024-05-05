/** 
 * Author: Austin Kinnear, CISC 191 Intermediate Java Programming  
 * Programming Project: UI-Control Traffic Light 
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLight extends JFrame implements ActionListener {
    // Radio buttons for red, yellow and green
    private JRadioButton redButton, yellowButton, greenButton;
    // Displays panel 
    private JPanel redPanel, yellowPanel, greenPanel;

    public TrafficLight() {
        setTitle("Traffic Light Simulator");
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Initialization of radio buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Having the buttons grouped allows for only one to be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Color panel display 
        redPanel = createColoredPanel(Color.RED);
        yellowPanel = createColoredPanel(Color.YELLOW);
        greenPanel = createColoredPanel(Color.GREEN);

        // Set the panels as blank
        redPanel.setVisible(false);
        yellowPanel.setVisible(false);
        greenPanel.setVisible(false);

        // Adds action listeners to radio buttons
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Framed components
        add(redPanel);
        add(yellowPanel);
        add(greenPanel);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);
        add(buttonPanel);
    }

    private JPanel createColoredPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setPreferredSize(new Dimension(50, 50));
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Starts with all lights being off for toggle purposses 
        redPanel.setVisible(false);
        yellowPanel.setVisible(false);
        greenPanel.setVisible(false);

        // Turns on light based on selection chosen
        if (redButton.isSelected()) {
            redPanel.setVisible(true);
        } else if (yellowButton.isSelected()) {
            yellowPanel.setVisible(true);
        } else if (greenButton.isSelected()) {
            greenPanel.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrafficLight frame = new TrafficLight();
            frame.setVisible(true);
        });
    }
}
