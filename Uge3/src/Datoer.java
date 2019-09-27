import java.util.Scanner;
public class Datoer {
    public static void main(String[] args){
        int nday=0,nmonth=0,nyear=0;
        Scanner scan = new Scanner(System.in);
        //Year
        System.out.print("Indtast år: ");
        int year = scan.nextInt();
        //Month
        System.out.print("Indtast måned: ");
        int month = scan.nextInt();
        //Day
        System.out.print("Indtast dag: ");
        int day = scan.nextInt();
        //all days in all months
        int[] arrayMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        //If Leap year
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){arrayMonth[1] += 1;}
        //If asking for more than the 12th month
        if (month > 12 || month <= 0 || day > arrayMonth[month - 1]) {
            System.out.println("Ugyldig dato");
        }
        //if the next day is not the new month
        else if (day + 1 <= arrayMonth[month - 1]) {
            System.out.println("Dagen efter " + day + "/" + month + " " + year + " er " + (day + 1) + "/" + month + " " + year);
        }
        //if next day is new month
        else {
            //If month is not end of year
            if (month + 1 <= 12){
                nmonth = month + 1;
                nyear = year;
            }
            //if last month in year
            else{
                nyear = year + 1;
                nmonth = 1;
            }
            //Print date of tomorrow
            System.out.println("Dagen efter " + day + "/" + month + " " + year + " er " + 1 + "/" + nmonth + " " + nyear);
        }
    }
}