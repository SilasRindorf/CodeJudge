import java.util.Scanner;
public class AsciiTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            //System.out.print("Please write a string of words: ");
            String input = scan.nextLine();
            if (input.equals("exit")) {
                break;
            } else {
                char inputArray = input.toCharArray()[0];
                CheckASCII(inputArray);
            }
        }
    }
    public static void CheckASCII(char c) {
        if ((c >= 'a' && c <= 'z'))
            System.out.println("Tegnet er et lille bogstav");
        else if (c >= 'A' && c <= 'Z') {
            System.out.println("Tegnet er et stort bogstav");
        } else if (c >= '0' && c <= '9') {
            System.out.println("Tegnet er et tal");
        } else if (c >= '!' && c <= '/' || c == 92) {
            System.out.println("Tegnet er et af de 4 specialtegn");
        } else
            System.out.println("Tegnet er ikke kendt af dette program");
    }
}