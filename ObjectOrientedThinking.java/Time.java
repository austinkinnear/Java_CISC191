
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        setTime(System.currentTimeMillis());
    }
    public Time(long elapseTime){
        setTime(elapseTime);
    }
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

    public void setTime(long elapseTime){
        long totalSeconds = elapseTime / 1000;
        second = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int)(totalHours % 24);
    }
}
