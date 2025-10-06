package Swicth;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Day ");
        int day = in.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
        default :
            System.out.println("Wrong Input");
        }


    }
}
