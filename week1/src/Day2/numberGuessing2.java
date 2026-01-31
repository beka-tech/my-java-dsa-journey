package Day2;

import java.util.Scanner;

public class numberGuessing2 {
   public  static  void gussingNumberGame(){
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (10*Math.random());
        int k =5;
        int i = 0;
        while (i< k){
            int guess = sc.nextInt();
            if(guess == number){
                System.out.println("You Got The Number");
                sc.close();
                return;
            } else if (guess > number) {
                System.out.println("Make It Lower ");
            } else if (guess < number) {
                System.out.println("Make It Higher");
            }
            i++;
        }
        System.out.println("Out Of Attempt");
        sc.close();
    }
    public static void main(String[] args) {
       gussingNumberGame();
    }

}
