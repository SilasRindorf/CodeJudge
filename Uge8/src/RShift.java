import java.util.Scanner;
public class RShift {
    public static void main(String[] args) {
        int[] ints = parseInput();
        int[] intsDest = new int[ints.length-1];
        //TODO Fill in logic
        for (int i = 0; i < intsDest.length; i++) {
            intsDest[i] = ints[i];
        }
        int var = ints[ints.length-1];
        for (int i = 0; i < var; i++) {
            for (int j = 0; j < intsDest.length; j++) {
                if (j+1 > intsDest.length-1)
                    intsDest[0] = ints[j];
                else
                    intsDest[j+1] = ints[j];
            }
            System.arraycopy(intsDest, 0, ints, 0, intsDest.length);

        }
        //System.arraycopy(intsDest, 0, intsDest, 1, intsDest.length-1);

        //System.arraycopy(ints, 1, intsDest, 0, ints.length - 1);
        //TODO Print the result to console
        for (int i:intsDest) {
            System.out.print(i + " ");
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
