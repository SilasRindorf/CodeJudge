import java.util.Scanner;
public class trekanter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Indtast sidelængden a: ");
        double a = scan.nextDouble();
        System.out.print("Indtast sidelængden b: ");
        double b = scan.nextDouble();
        System.out.print("Indtast sidelængden c: ");
        double c = scan.nextDouble();

        double A = ((Math.acos((Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2))/(2*c*b)))*180)/Math.PI;
        double B = ((Math.acos((Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2))/(2*a*c)))*180)/Math.PI;
        double C = ((Math.acos((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2))/(2*a*b)))*180)/Math.PI;

        if ( a == 0 || b == 0 || c == 0 || a + b < c || a + c < b || b + c < a) {
            System.out.println("Noget er galt!");
        }
        else if ( a == b && b == c){
            System.out.println("Trekanten er ligesidet");
        }
        else if ( a == b || b == c || a == c){
            System.out.println("Trekanten er ligebenet");
        }

        else if ( A == 90 || B == 90 || C == 90){
            System.out.print("Trekanten er retvinklet");
        }
        else if ( A < 90 && B < 90 && C < 90){
            System.out.println("Trekanten er spids");
        }
        else if ( A > 90 || B > 90 || C > 90){
            System.out.println("Trekanten er stump");
        }
    }
}
