package Week6;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter WEIGHT(kg) = ");
        float wetghr = kb.nextFloat();
        System.out.print("Enter HEIGHT(m) = ");
        float height = kb.nextFloat();

        System.out.println("WEIGHT = " + "weight");
        System.out.println("HEIGHT = " + "height");
        System.out.println("ดัชนีมวลกาย คือ (BMI) = " + wetghr / (height * height));
        kb.close();
    }

}
