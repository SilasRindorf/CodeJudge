import javax.swing.text.html.MinimalHTMLWriter;
import java.util.Scanner;
public class PasswordChecker {
    final static int MAXLENGTH = 8;
    final static int MINLENGTH = 5;

    public static void main(String[] args) {
        boolean k = true;
        Scanner scan = new Scanner(System.in);
        while (k) {
            //Get user password from input
            String password = scan.nextLine();
            //System.out.print("Select a password between " + MINLENGTH +  " and " + MAXLENGTH + " characters: ");
            //Save password to string
            //use .length() to find length of string
            int passwordLength = password.length();
            //Check if password is too short
            if (passwordLength < MINLENGTH) {
                //Find the difference between min length and the current length and makes the value positive
                //int passDif = Math.abs(passwordLength - MINLENGTH);
                System.out.println("Password for kort");
                //System.out.println("Your password: \'" + password + "\' is too short. It needs to be: " + passDif + " character(s) longer");
            } else if (passwordLength > MAXLENGTH) {
                //int passDif = passwordLength - MAXLENGTH;
                System.out.println("Password for langt");
                //System.out.println("Your password: \'" + password + "\' is too long. It needs to be: " + passDif + " character(s) shorter");
            } else {
                System.out.println("Password tilpas");
                //System.out.println("Your password: \'" + password + "\' is long enough");
                k = false;
            }
        }
    }
}
