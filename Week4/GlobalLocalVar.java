package Week4;
public class GlobalLocalVar {
    public static void main(String[] args) {
        //ตัวเปรเเบบ Global
        int a = 100;
        int b = 200;

        System.out.println(a);
        {
        //ตัวเเปร Local
          int c = 300;
          System.out.println(c);
          System.out.println(a);
        }

        //System.out.println(c);
      
    }
    
}
