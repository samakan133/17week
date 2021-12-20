package Week11;

public class ForLoop_01 {
    public static void main(String[] args) {

        // int count = 1; // ค่าเริ่มต้น
        // while (count <= 100) { // เงื่อนไข
        // System.out.println("รอบที่ "+count+" Java"); // ค่าที่ต้องการเเสดงผล
        // count++; // update รอบ
        // }
        int sum = 0;
        for (int number = 1; number <= 10; number++) {
            sum = sum + number;
            System.out.println("รอบที่ " + number + " ผลบวกเท่ากับ " + sum);

        }
        System.out.println("รวมเท่ากับ " + sum);

        // int number = 1;
        // int sum = 0;
        // while (number<=10) {
        // sum = sum+number;
        // System.out.println("รอบที่ "+number+" ผลบวกเท่ากับ " + sum);
        // number++;

        // }
        // System.out.println("รวมเท่ากับ "+sum);
    }
}
