import java.util.Scanner;
public class BonusFibonacciTal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int x1 = 0;
        int x2 = 0;
        int x3 = 1;
        for (int i=0; i < length; i++){
            System.out.println(x3);
            x1=x2;
            x2=x3;
            x3=x1+x2;
        }
    }
}