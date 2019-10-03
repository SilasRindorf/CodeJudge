import java.util.Scanner;
public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String[] check = {"1  - 10  | ", "11  - 20  | ", "21  - 30  | ", "31  - 40  | ", "41  - 50  | ", "51  - 60  | ", "61  - 70  | ", "71  - 80  | ", "81  - 90  | ", "91  - 100 | "};
        for (String s : input) {
            check[(int)(Double.parseDouble(s) / 10.0000000000001)] += '*';
        }
        for (String s : check) {
            System.out.println(s);
        }
    }
}