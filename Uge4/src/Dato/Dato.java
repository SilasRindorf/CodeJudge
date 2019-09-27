package Dato;
import java.text.NumberFormat;
public class Dato {
    private NumberFormat nf = NumberFormat.getInstance();
    public static void main(String[] args) {
        // nf.setMinimumIntegerDigits
        Dato d1 = new Dato(2015, 9, 8);
        Dato d2 = new Dato(1999,1,2);
        System.out.println(d1.danish());
        System.out.println(d1.danishText());
        System.out.println(d2.iso());
    }
    private final static String[] arrayMonths = new String[] {"Januar","Februar","Marts","April","Maj","Juni",
            "Juli","August","September","Oktober","November","December"};
    private int year;
    private int month;
    private int day;
    private Dato(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    private String danish(){return day + "/" + month + "-" + year;}
    private String danishText(){return day + ". " + arrayMonths[month-1] + " " + year;}
    private String iso(){
        nf.setMinimumIntegerDigits(2);
        return nf.format(year) + "-" + nf.format(month) + "-" + nf.format(day);
    }
}