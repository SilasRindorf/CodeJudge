import java.util.Scanner;
public class GuessName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        while (true) {
            String guess = scan.next();
            if (name.compareToIgnoreCase(guess) < 0){
                System.out.println("Mit navn er før i alfabetet.");
            }
            else if (name.compareToIgnoreCase(guess) > 0){
                System.out.println("Mit navn er efter i alfabetet.");
            }
            else{
                System.out.println("Du gættede rigtigt.");
                break;
            }
        }
    }
}