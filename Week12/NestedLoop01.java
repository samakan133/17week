package Week12;

public class NestedLoop01 {
    public static void main(String[] args) {
        //int number = 2;
        for (int i = 2; i <= 3; i++) { // Loop นอก เเม่สูตรคูณ
            for (int j = 1; j <= 12; j++) { // Loop ใน จำนวนครั้งที่จะคูณในเเต่ละเเม่
                System.out.println(i+"*"+ j + "=" + (i * j));
            }

        }
    }

}
