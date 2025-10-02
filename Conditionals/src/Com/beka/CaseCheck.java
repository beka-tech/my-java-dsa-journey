package Com.beka;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Char ");
        char ch = in.next().trim().charAt(0);
        if (ch == 65){
            System.out.println("It is Capital A");
        }
        else {
            System.out.println("Not ");
        }
    }
}
