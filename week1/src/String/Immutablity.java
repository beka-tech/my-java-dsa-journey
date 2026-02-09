package String;

public class Immutablity {
    public static void main(String[] args) {
        String s1 = "Beka";
        String s2 = " Aman";

        System.out.println(s1.concat(s2));
        System.out.println('l');

        String s3 = new String("Using Constractor");
        System.out.println(s3);
    }
}
