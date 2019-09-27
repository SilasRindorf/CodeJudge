import java.util.Scanner;
public class Pyramide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        String[] previous = new String[Math.abs(height) + 1];
        previous[0] = "";
        if (height >= 0) {
            for (int i_s = 1; i_s <= height; i_s++) {
                System.out.println("Pyramid " + i_s);
                for (int i = 1; i <= i_s; i++) {
                    String out = "";
                    String dot = "";
                    for (int i_1 = 1; i_1 <= i_s - i; i_1++) {
                        dot += '.';
                    }
                    for (int i_2 = 1; i_2 <= i; i_2++) {
                        out += '#';
                    }
                    previous[i] = out;
                    out += previous[i - 1];
                    out = dot + out + dot;
                    System.out.println(out);
                }
            }
        }
    }
}