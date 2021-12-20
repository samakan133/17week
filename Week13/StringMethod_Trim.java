package Week13;

public class StringMethod_Trim {
    public static void main(String[] args) {
        String fullname = "   Samakan Panyaroj   ";
        
        int connt = fullname.length();
        System.out.println(connt);
        System.out.println("before =>"+fullname);

        //.trim() ตัวช่องว่างหน้าหลังออก
        String result = fullname.trim();
        System.out.println("after ==>" +result);
        System.out.println(result.trim());

        // .indexof() เเสดงผลตำเเหน่งที่ของอักษร
        System.out.println(fullname.indexOf("ma",9));

        // .toUpperCase()   .toLowerCase()
        System.out.println(result.toUpperCase());
        System.out.println(result.toLowerCase());

        // .substring()  การตัดคำที่ต้องการ
        String uni = "Nakhon Pathom Rajabhat University";
        System.out.println(uni.substring(5,10));
    }
    
}
