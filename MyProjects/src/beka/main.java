package beka;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num1 ");
        float num = input.nextFloat();
        System.out.print("Enter Num2 ");
        float num2 = input.nextFloat();
        float total = num + num2;
        System.out.println("Your Total "+ total);
    }
}
