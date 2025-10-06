package Swicth;

import java.util.Scanner;

public class swicth1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        while (true){
            System.out.print("Enter Your Name ");
            String name = in.next();
            if (name.equals("Beka") || name.equals("beka") ){
                System.out.println("True");
                break;
            }
            else {
                System.out.println("Not Found");
            }
        }

    }
}
