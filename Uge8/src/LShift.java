import java.util.Scanner;
public class LShift {
    public static void main(String[] args) {
        int[] ints = parseInput();
        int[] destInts = new int[ints.length ];
        destInts[ints.length-1] = ints[0];
        for (int i=0; i <ints.length-1; i++){
            destInts[i] = ints[i+1];
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.print(destInts[i] + " ");
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
