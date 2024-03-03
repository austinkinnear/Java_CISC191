/**
 * Author: Austin Kinnear, CISC 191 Intermediate Java Programming
 * Object Oriented Thinking Project number 2 in CISC 191
 */
public class Time {
    // hours, minutes and second private fields
    private int hour;
    private int minute;
    private int second;

    // Constructor initalizing time as the current time
    public Time(){
        setTime(System.currentTimeMillis());
    }

    // Consturctor initalizing time as elapsed time from January 1, 1970
    public Time(long elapseTime){
        setTime(elapseTime);
    }

    // Constructor initalizing time with specific hour, minute and second
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    // Method that returns hours
    public int getHour(){
        return hour;
    }

    // Method that returns minutes
    public int getMinute(){
        return minute;
    }

    // Method that returns seconds
    public int getSecond(){
        return second;
    }

    // Method that calculates the hours, minutes, and seconds as milliseconds from elapseTime to seconds then seconds to minutes then minutes to hours from January 1, 1970
    public void setTime(long elapseTime){
        long totalSeconds = elapseTime / 1000; // Milliseconds to seconds
        second = (int)(totalSeconds % 60); 
        long totalMinutes = totalSeconds / 60; // Seconds to minutes
        minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60; // Minutes to hours
        hour = (int)(totalHours % 24); 
    }
}
