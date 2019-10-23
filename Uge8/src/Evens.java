import java.util.Scanner;

public class Evens {

    public static void main(String[] args) {
        int[] ints = parseInput();
        //TODO Fill in logic


        //TODO Print the result to console

        System.out.println(even(ints));
    }

    private static int[] parseInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] strings = input.split(" ");
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        scan.close();
        return ints;
    }
    private static int even(int[] arrayInt){
        int counter = 0;
        for (int value : arrayInt) {
            if (even(value))
                counter++;
        }
        return counter;
    }
    private static boolean even(int number){
        return number % 2 == 0;
    }
}
