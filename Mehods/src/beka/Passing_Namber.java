package beka;

import java.util.Scanner;

public class Passing_Namber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the First Number ");
        int a = in.nextInt();
        System.out.print("Enter the Second Number ");
        int b = in.nextInt();

//        int ans = sum3(a,  b );

        System.out.println("The Sum " + sum3(a,  b ));
    }
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
}
