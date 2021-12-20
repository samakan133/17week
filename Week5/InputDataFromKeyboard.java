package Week5;
import java.util.Scanner;
public class InputDataFromKeyboard {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your ID : ");
        String id = kb.nextLine();

        System.out.print("Enter your name and surname : ");
        String name = kb.nextLine();

        System.out.print("Enter your birth day : ");
        int year = kb.nextInt();

        System.out.print("Enterter your GPA : ");
        double gpa = kb.nextDouble();
        
        int age = 2564-year;

        System.out.println(id+" "+name+" "+year+" "+gpa);
        ;


    }
}
