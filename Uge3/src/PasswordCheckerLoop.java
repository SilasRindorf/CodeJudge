import java.util.Scanner;
public class PasswordCheckerLoop {
    private static int MAXLENGTH = 8;
    private static int MINLENGTH = 5;

    public static void main(String[] args) {
        boolean k = true;
        while (k) {
            Scanner scan = new Scanner(System.in);
            //Get user password from input. () on MAXLENGTH is not needed.
            System.out.print("Select a password larger than " + (MINLENGTH - 1)  + " and smaller than " + (MAXLENGTH + 1) + " characters: ");
            //Save password to string
            String password = scan.nextLine();
            //use .length() to find length of string
            int passwordLength = password.length();
            //Check if password is too short
            if (passwordLength < MINLENGTH) {
                //Find the difference between min length and the current length and makes the value positive
                int passDif = Math.abs(passwordLength - MINLENGTH);
                System.out.println("Your password: \'" + password + "\' is too short. It needs to be: " + passDif + " character(s) longer");
            } else if (passwordLength > MAXLENGTH) {
                int passDif = passwordLength - MAXLENGTH;
                System.out.println("Your password: \'" + password + "\' is too long. It needs to be: " + passDif + " character(s) shorter");
            } else {
                System.out.println("Your password: \'" + password + "\' is the correct amount of characters");
                k = false;
            }
        }
        System.exit(0);
    }
}

