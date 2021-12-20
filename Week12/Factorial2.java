package Week12;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner kb = new  Scanner(System.in);
        System.out.print("Enter Namber : ");
        int number = kb.nextInt();
        // Output 4! ==> 4*3*2*1 = 24

        int i = number;
        int result=1;

        System.out.print(number+"! ==> ");
        while (i >=1) {
            if (i==number) {
                System.out.print(i); 
            } else {
                System.out.print("*"+i);  
            }
            
            result = result*i;
            i--;  
        }
        System.out.println(" = "+result);
    }

}
