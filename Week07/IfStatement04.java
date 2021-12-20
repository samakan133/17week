package Week07;
import java.util.Scanner;
public class IfStatement04 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number");

        int n = kb.nextInt();
        int Check = n % 2;

        if (Check == 0) {
            System.out.println(n + "is Even Number ");
        } else {
            System.out.println(n + "is Odd Number ");
            
        }
        System.out.println("End Program");
        kb.close();
    }
    
}
