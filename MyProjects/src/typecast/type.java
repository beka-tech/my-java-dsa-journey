package typecast;

public class type {
    public static void main(String[] args) {
        int a = 257;
        byte b =  (byte)(a);
        System.out.println(b);

        double d = 32.23;
        float e = (float) (d);
        System.out.println(e);

        int number = 'A';
        System.out.println(number/2);

    }
}
