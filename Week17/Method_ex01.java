package Week17;

public class Method_ex01 {
    public static void main(String[] args) {
        // method เเบบที่ 1 ไม่มีการส่งค่าจาก method main เเละ ไม่มีการคืนค่ากลับจาก method ลูก
       openFile();
       playFile();
       pauseFile();
       playFile();
       closeFile();
    }
    public static void openFile(){
        System.out.println("Open file.............");
    }

    public static void playFile(){
        System.out.println("Play Misic............");
    }

    public static void pauseFile(){
        System.out.println("stop Misic............");
    }

    public static void closeFile(){
        System.out.println("ean program............");
    }
}
