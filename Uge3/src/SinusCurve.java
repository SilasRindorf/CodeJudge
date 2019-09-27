import java.text.DecimalFormat;
import java.util.Scanner;
public class SinusCurve {
    public static String Amplitude(int s) {
        String amplitude = "";
        for (int i = 1; i <= s; i++) {
            amplitude += " ";
        }
        return amplitude;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String amplitudeTwenty = Amplitude(20);
        int length = scan.nextInt();
        for (int i_1 = 1; i_1 <= length; i_1++) {
            for (int i = 1; i <= 16; i++) {
                if (i == 1) {
                    System.out.print(amplitudeTwenty);
                    System.out.println('*');
                } else if (i == 2 || i == 8) {
                    System.out.print(amplitudeTwenty);
                    System.out.print('|');
                    System.out.print(Amplitude(6));
                    System.out.println('*');
                } else if (i == 3  || i == 7) {
                    System.out.print(amplitudeTwenty);
                    System.out.print('|');
                    System.out.print(Amplitude(13));
                    System.out.println('*');
                } else if (i == 4 || i == 6) {
                    System.out.print(amplitudeTwenty);
                    System.out.print('|');
                    System.out.print(Amplitude(17));
                    System.out.println('*');
                } else if (i == 5) {
                    System.out.print(amplitudeTwenty);
                    System.out.print('|');
                    System.out.print(amplitudeTwenty);
                    System.out.println('*');
                } else if (i == 9) {
                    System.out.print(amplitudeTwenty);
                    System.out.println('*');
                } else if (i == 10 || i == 16) {
                    System.out.print(Amplitude(13));
                    System.out.print('*');
                    System.out.print(Amplitude(6));
                    System.out.println('|');
                } else if (i == 11 || i == 15) {
                    System.out.print(Amplitude(6));
                    System.out.print('*');
                    System.out.print(Amplitude(13));
                    System.out.println('|');
                } else if (i == 12 || i == 14) {
                    System.out.print(Amplitude(2));
                    System.out.print('*');
                    System.out.print(Amplitude(17));
                    System.out.println('|');
                } else if (i == 13) {
                    System.out.print('*');
                    System.out.print(Amplitude(19));
                    System.out.println('|');
                }
            }
        }
    }
}