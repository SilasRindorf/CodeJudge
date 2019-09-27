import java.util.Scanner;
public class Dist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float x_0 = scan.nextFloat();
        float y_0 = scan.nextFloat();

        double dist = Math.abs((a * x_0 - y_0 + b)/(Math.sqrt(1f + Math.pow(a, 2))));

        System.out.println(dist);
    }
}
