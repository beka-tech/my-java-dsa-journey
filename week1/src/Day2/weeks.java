package Day2;

import java.util.Scanner;

public class weeks {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Num of Days");
        int days = num.nextInt();
        switch (days){
            case 1:
                System.out.println("MonDay");
                break;
            case 2:
                System.out.println("TuesDay");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + days);
        }
    }
}
