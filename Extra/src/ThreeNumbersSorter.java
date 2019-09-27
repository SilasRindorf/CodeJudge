import java.util.Scanner;
public class ThreeNumbersSorter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        double input2 = scan.nextDouble();
        double input3 = scan.nextDouble();
        if (input < input2 && input < input3) {
            System.out.println(input);
            /*if (input2 < input3){
                System.out.println(input2);
                System.out.println(input3);
            }
            else{
                System.out.println(input3);
                System.out.println(input2);
                return;
            }*/
        } else if (input2 < input3 && input2 < input) {
            System.out.println(input2);
            /*if (input < input3){
                System.out.println(input);
                System.out.println(input3);
            }
            else{
                System.out.println(input3);
                System.out.println(input);
            }*/
        } else {
            System.out.println(input3);
            /*if(input < input2){
                System.out.println(input);
                System.out.println(input2);
            }
            else {
                System.out.println(input2);
                System.out.println(input);*/
        }
    }
}