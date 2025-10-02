package Com.beka;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        System.out.print("Enter How Number  ");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        for( int i = 1 ; i <= num; i++){
            System.out.println(i);
        }

    }
}
