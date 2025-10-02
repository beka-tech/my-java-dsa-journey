package Com.beka;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number of Fibonacci Index .");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 1;

        while (count <= n ){
            int temp = b;
            b = b + a;
            a = temp;
            count ++;
        System.out.println(b);
        }
    }
}
