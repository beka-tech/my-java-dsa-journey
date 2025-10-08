package beka;

import java.util.Scanner;

public class Passing_String2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name ");
        String name = in.next();

        String Massage = names(name);
        System.out.print(Massage);
    }
    static String names(String name){
        String msg ="Hello "+ name;
        return msg;
    }
}
