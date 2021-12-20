package Week17;

public class Method_ex03 {
    // method เเบบที่ 3 ไม่มีการรับค่าที่ส่งมาจาก main program เเต่ลูกส่งค่าออกคืนเเม่
    public static void main(String[] args) {
        int phone = getPhoneNumber(); 
        System.out.println(getPhoneNumber());
        int locky = 999;
        int newphone = phone+locky; 
        System.out.println(newphone);
    }

    static int getPhoneNumber(){
        return 906283647;
    }
}
