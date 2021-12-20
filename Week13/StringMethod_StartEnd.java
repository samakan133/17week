package Week13;

public class StringMethod_StartEnd {
    public static void main(String[] args) {
        String fullname = "นายสมชาย เข็มขัด";

        // หาตำเเหน่งของคำจากด้านหน้า  .startswith()
        boolean result = fullname.startsWith("นาย");

        if (result) {
            System.out.println(fullname + " เป็นเพศชาย");
        } else {
            System.out.println(fullname + " เพศหญิง"); 
        }

            // หาตำเเหน่งของคำด้านหลัง  .endsWith()
            String code = "356278Th";
            boolean result1 = code.endsWith("TH");
            if (result1) {
                System.out.println("สินค้า" + code + "มาจากประเทศไทย");
            } else {
                System.out.println("สินค้า" + code + "ไม่ได้มาจากประเทศไทย");
            }

    }

}
