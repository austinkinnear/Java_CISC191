public class TestTimeClass {
    public static void main(String[] args){

        // Time objects for current time, elapsed time, specified time
        Time currentTime = new Time(); 
        Time elapsedTime = new Time(555550000); 
        Time specifiedTime = new Time(5, 23, 55);

        // Print current time, elapsed time and specific time
        System.out.println("Current time is " + currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
        System.out.println("Elapsed time is " + elapsedTime.getHour() + ":" + elapsedTime.getMinute() + ":" + elapsedTime.getSecond());
        System.out.println("Specified time is " + specifiedTime.getHour() + ":" + specifiedTime.getMinute() + ":" + specifiedTime.getSecond());
    }
}
