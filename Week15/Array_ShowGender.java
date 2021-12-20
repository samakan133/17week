package Week15;

public class Array_ShowGender {
    public static void main(String[] args) {
        String[] name = { "นายสมชาย", "นางสาวสมหญิง", "นางสมนึก", "นางสาวสมใจ", "นายสมดี" };
        System.out.println(name.length);

        for (int i = 0; i < name.length; i++) {
            boolean check = name[i].startsWith("นาย");
            if (check) {
                System.out.println(name[i]);
                System.out.println("เพศชาย");
            } else {
                System.out.println(name[i]);
                System.out.println("เพศหญิง");

            }
            //System.out.println(name[i]);
        }
    }

}
