package Com.beka;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true){
            System.out.print("Enter a number");
            int num = in.nextInt();
            if (num == 0 ){
                break;
            }
                String ans;
                if (num%2==0){
                      ans ="Even" ;
                }
                else {
                     ans= "Odd";
                }

            System.out.println(ans);
        }
    }
}
