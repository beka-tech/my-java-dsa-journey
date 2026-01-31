package Day2;

import java.util.Scanner;

public class numberGuessing {
    public static void main(String[] args) {


        int k = 1 + (int)(5 * Math.random());


        int attempt = 5;
        while (attempt>=0){
            Scanner input = new Scanner(System.in);
            System.out.println("Type the Number You Guss");
            int g = input.nextInt();
//            System.out.println("You Got "+attempt+" Attemp");
            if (k==g){
                System.out.println("you got it");
                break;
            }
            else if(g<k){
                System.out.println("Make It Higher");
            }
            else if(g>k){
                System.out.println("Make It Lower");
            }
            attempt--;

        }
        System.out.println("The Number Was "+ k );
    }
}
