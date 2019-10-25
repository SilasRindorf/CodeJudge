import java.util.Scanner;
public class LShift {
    public static void main(String[] args) {
        int[] ints = parseInput();
        int[] intsDest = new int[ints.length ];
        intsDest[ints.length-1] = ints[0];
        System.arraycopy(ints, 1, intsDest, 0, ints.length - 1);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(intsDest[i] + " ");
        }
    }

    private static int[] parseInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] strings = input.split(" ");
        int[] ints = new int[strings.length];
        for (int i = 0;i<ints.length;i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        scan.close();
        return ints;
    }
}
