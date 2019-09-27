import java.util.Arrays;
import java.util.Scanner;
public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String[] check = {"1  - 10  | ", "11  - 20  | ", "21  - 30  | ", "31  - 40  | ", "41  - 50  | ", "51  - 60  | ", "61  - 70  | ", "71  - 80  | ", "81  - 90  | ", "91  - 100 | "};
        for (int i = 0; i < input.length; i++) {
            check[(Integer.parseInt(input[i]) / 11)] += '*';
        }
        for (int i = 0; i < check.length; i++) {
            System.out.println(check[i]);
        }
    }
}