package Week15;

public class Array_Basic01 {
    public static void main(String[] args) {
        // การประกาศตัวเเปรเเบบ Array
        // เเบบที่ 1 : ประกาศเเบบกำหนดสมาชิก
        int[] number = { 1, 4, 8, 6, 4, 2, 5 };
        int size = number.length;
        System.out.println(size);
        System.out.println(number.length); // หาความยาวของ อาเรย์
        System.out.println(number[3]); // การเข้าถึงตำเเหน่งของตัวเเปร
        number[3] = 88; // การเปลี่ยนค่าข้อมูลในตัวเเปร
        System.out.println(number[3]);

        // เเบบที่ 2 : ประกาศเเบบกำหนดขนาด
        
       // char [] alphabet;//ประกาศอาเรย์
       // alphabet = new char [26];   // สร้างอาเรย์

        char [] alphabet = new char [26];
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';

        System.out.println(alphabet[2]);
        System.out.println(alphabet[25]);
        System.out.println(alphabet.length);

        int[]num = new int [10];
        System.out.println(num[9]);


    }

}
