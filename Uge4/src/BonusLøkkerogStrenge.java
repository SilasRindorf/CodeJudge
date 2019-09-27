import java.util.Scanner;
public class BonusLøkkerogStrenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] inputChar = scan.nextLine().toCharArray();
        int inputInt = Character.getNumericValue(inputChar[inputChar.length-1]);
        char[] outputChar = new char[(inputChar.length-1)*inputInt];
        for (int i=0; i < outputChar.length; i++){
            outputChar[i] = inputChar[i/inputInt];
        }
        System.out.println(outputChar);
    }
}