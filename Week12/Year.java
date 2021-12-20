package Week12;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        System.out.println();
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println(" กด 1 เพื่อเปลี่ยนจาก พ.ศ เป็น ค.ศ");
            System.out.println(" กด 0 เพื่อจบการทำงาน");
            System.out.println("กดเลือกตัวเลข : ");
            int number = kb.nextInt();
            if (number == 1) {
                while (true) {
                    System.out.println("เข้าสู้การเปลี่ยน พ.ศ เป็น ค.ศ");
                    System.out.println("กด 0 เพื่อจบการทำงาน");
                    System.out.println("กรูณากรอกปี พ.ศ");
                    int ps = kb.nextInt();
                    if (ps < 0) {
                        System.out.println("พ.ศ ติดลบหรือเป็นศูนย์");
                    }
                    if (ps == 0) {
                        System.out.println("จบการทำงาน");
                        break;
                    } else {
                        System.out.println("ปี ค.ศ คือ "+ (ps - 543)); 
                    }

                }
                kb.close();

            }

        }
    }

}
