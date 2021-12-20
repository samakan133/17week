package Week13;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Samakan";
        String city = new String("Nakhon pathom");

        System.out.println(name);
        System.out.println(city);

        // การต่อสตริง concatenation
        System.out.println(name+city);

        String result = name+city;
        System.out.println(result);

        String result2 = name+city+".com";
        System.out.println(result2);

        System.out.println(result2.concat(".ac.th"));
        System.out.println(result2+".ac.th");

        // หาความยาวของสตริง .Length()
        System.out.println(name.length());

        int count = name.length();
        System.out.println(count);

        // หาตำเเหน่งตัวอักษรในข้อความ  .charAt()
        System.out.println(name.charAt(0));

        char Characters = name.charAt(0);
        System.out.println(Characters);

    }
    
}
