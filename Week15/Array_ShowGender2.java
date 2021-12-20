package Week15;

public class Array_ShowGender2 {
    public static void main(String[] args) {
        String[] name = { "นายสมชาย เข็มขัด", "นางสาวสมหญิง เข็มขัด", "นางสมนึก เข็มขัด", "นางสาวสมใจ เข็มขัด",
                "นายสมดี เข็มขัด" };
        System.out.println("มีรายชื่อทั้งหมด " + name.length + " รายชื่อ");
        for (int i = 0; i < name.length; i++) {
            boolean check = name[i].startsWith("นาย");
            if (check) {

                System.out.println((i + 1) + ". " + name[i] + " ==> เป็นเพศชาย");
            } else {

                System.out.println((i + 1) + ". " + name[i] + " ==> เป็นเพศหญิง");

            }

        }
    }

}
