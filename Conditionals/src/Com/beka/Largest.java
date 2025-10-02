package Com.beka;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number _ ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int max = Math.max (d, Math.max (c, (Math.max(a,b))));
        System.out.println( max  );
    }
}
