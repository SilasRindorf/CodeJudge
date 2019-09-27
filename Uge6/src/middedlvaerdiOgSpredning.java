import java.util.ArrayList;
import java.util.Scanner;
public class middedlvaerdiOgSpredning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mean = 0;
        double deviation = 0;
        String input = scan.nextLine();
        String[] arrayInput = input.split(" ");
        double[] arrayDouble = new double[arrayInput.length];
        for (int i=0; i < arrayInput.length; i++){
            arrayDouble[i] = Double.parseDouble(arrayInput[i]);
            mean += arrayDouble[i];
        }
        mean /= arrayDouble.length;
        for (double v : arrayDouble) {
            deviation += Math.pow(v - mean, 2);
        }
        deviation = Math.sqrt(1.0/arrayDouble.length*deviation);
        System.out.println("Mean: " + mean);
        System.out.println("Standard deviation: " + deviation);
    }
}