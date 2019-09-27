import sun.org.mozilla.javascript.internal.Function;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Parable {
    public static void Exit(int e){
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        System.exit(e);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Select a \'A\' value, \'B\' value and \'C\'. Put a space between the characters: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0){
            System.out.println("There is no roots");
            Exit(1);
        }
        else if (a + b == 0 && !(c == 0)){
            System.out.println("The line doesn't hit the x-axis");
            Exit(2);
        }
        else if (a + b == 0 && (c == 0)){
            System.out.println("There is no function");
            Exit(3);
        }
        else if (a == 0) {
            System.out.println("There is no root, since it is not a parable\nThe line hits the x-axis in: " + -(c / b));
            Exit(4);
        }
        double x_1 = (-b + Math.sqrt(d)) / (2 * a);
        double x_2 = (-b - Math.sqrt(d)) / (2 * a);
        if (x_1 == x_2){
            System.out.println("The root of the parable is: " + x_1);
        }
        else {
            System.out.println("The roots of the parable is: " + x_1 + " " + x_2);
        }
        Exit(5);
    }

}
