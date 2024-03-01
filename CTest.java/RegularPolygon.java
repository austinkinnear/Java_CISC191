/**
 * Author: Austin Kinnear, CISC 191 Intermediate Java Programming
 * Creating an n-sidded polygon with equal lengths and angles
 */
public class RegularPolygon {
    private int n; // number of sides n
    private double side; // length of the side
    private double x; // x-coordinate of the polygon's center
    private double y; // y-coordinate of the polygon's center

    // Constructor to set default values of the polygon
    public RegularPolygon() {
        this(3, 1, 0, 0); // Sets n to 3, side length to 1, and x,y coordinates to 0
    }

    // Constructor with specified number of sides and length of side
    public RegularPolygon(int n, double side) {
        this(n, side, 0, 0);
    }

    // Constructor with assigned values for n, side, x and y
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor(get) and mutator(set) 
    public int getN() { // Returns number of sides of the polygon
        return n;
    }

    public void setN(int n) { // Sets number of sides for the polygon
        this.n = n;
    }

    public double getSide() { // Returns length of side
        return side;
    }

    public void setSide(double side) { // Set length of each side
        this.side = side;
    }

    public double getX() { // Returns x from center
        return x;
    }

    public void setX(double x) { // Sets x from center
        this.x = x;
    }

    public double getY() { // Returns y from center
        return y;
    }

    public void setY(double y) { // Sets y from center
        this.y = y;
    }

    // Returns the perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }

    // Returns the area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)); // Using the Math class (n*s^2/4(*tan(pi/n)))
    }

    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon(); // Default instance of the polygon
        RegularPolygon polygon2 = new RegularPolygon(6, 4); // 6 sided instance of the polygon
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8); //10 sided instance of the polygon

        // All print statements that will be seen in the terminal 
        System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter());
        System.out.println("Polygon 1 area: " + polygon1.getArea());

        System.out.println("Polygon 2 perimeter: " + polygon2.getPerimeter());
        System.out.println("Polygon 2 area: " + polygon2.getArea());

        System.out.println("Polygon 3 perimeter: " + polygon3.getPerimeter());
        System.out.println("Polygon 3 area: " + polygon3.getArea());
    }
}
