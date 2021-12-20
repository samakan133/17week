package Week17;

public class Array_forEach {
    public static void main(String[] args) {
        String[] name = { "นายสมชาย เข็มขัด", "นางสาวสมหญิง เข็มขัด", "นางสมนึก เข็มขัด", "นางสาวสมใจ เข็มขัด",
                "นายสมดี เข็มขัด" };
        System.out.println("มีรายชื่อทั้งหมด " + name.length + " รายชื่อ");
        int i=1;
        for (String showName : name) {
            System.out.println(i+". "+showName);
            i++;
        }

        int [] namber = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int j : namber) {
            sum = sum+j;
        }
        System.out.println(sum);
        

        // for (int i = 0; i < name.length; i++) {
        //     boolean check = name[i].startsWith("นาย");
        //     if (check) {

        //         System.out.println((i + 1) + ". " + name[i] + " ==> เป็นเพศชาย");
        //     } else {

        //         System.out.println((i + 1) + ". " + name[i] + " ==> เป็นเพศหญิง");

        //     }

        // }
    }
}
