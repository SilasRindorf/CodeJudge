import java.util.Scanner;
public class TimeConverter {
    //These doesn't need to be private, they can be public
    private static int SECONDSPERMINUTE = 60;
    private static int MINUTESPERHOUR = 60;
    private static int HOURSPERDAY = 24;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //System.out.print("Select seconds: ");
        int totalSeconds = scan.nextInt();
        int totalMinutes = totalSeconds / SECONDSPERMINUTE;
        int totalHours = totalMinutes / MINUTESPERHOUR;
        int totalDays = totalHours / HOURSPERDAY;
        int originalSeconds = totalSeconds;
        totalSeconds %= 60;
        totalMinutes %= 60;
        totalHours %= 24;
        System.out.println(originalSeconds + " seconds equals " + totalDays + " days, "  + totalHours + " hours, "  + totalMinutes  +  " minutes and " + totalSeconds + " seconds.");
    }
}
