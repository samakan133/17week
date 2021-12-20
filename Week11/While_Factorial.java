package Week11;

import java.util.Scanner;

public class While_Factorial {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number");
        int i = kb.nextInt();
        System.out.print(i + "!= ");
        int num_db = 1;
        int fact = 1;
        int number = i;
        while (num_db <= number) {
            fact = fact * num_db;
            num_db++;
        }
        while (i >= 1) {
            System.out.print(i + " ");
            i--;   
        }
        System.out.println("Factorial ของ " + number + " คือ " + fact);
        kb.close();
    }

}
