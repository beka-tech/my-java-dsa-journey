package Day2;

import java.math.BigInteger;

public class Ternary {
    public static void main(String[] args) {
    int lightspeed;
    long days;
    long seconds;
    long distance;

    lightspeed = 18600;

    days = 100;

    seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;
        BigInteger d =  BigInteger.valueOf(distance);

        System.out.println(distance);
        System.out.println(d);
        char a = 'A';
        a++;
        System.out.println(a);
        int x = 07;
        int y = 1;
        System.out.println(x+y );
        System.out.println("Beka aman");
        String Message = " da ";
        System.out.println(Message);
    }
}
