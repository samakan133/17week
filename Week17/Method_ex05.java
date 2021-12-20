package Week17;

import java.util.Scanner;

public class Method_ex05 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int [] number = new int [3];
        // System.out.println(number.length);

        for (int i = 0; i < number.length; i++) {
            System.out.print("enter number : ");
            number [i] = kb.nextInt();
        }
        int sum = 0;
        System.out.print(" { ");
        for (int i : number) {
            if (sum<=i) {
                System.out.print(i+",");
            } else {
                System.out.print(i);
            }
            sum = sum + i;
        }
        System.out.println(" } ");
        System.out.println(" = " + sum);
        kb.close();
    }
}
