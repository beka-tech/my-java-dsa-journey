package Methods;

import static java.lang.Math.*;

public class callstackDemo {
    static void A(){
        B();
        System.out.println("This Is A");
    }
    static void B(){
        C();
        System.out.println("This Is B");
    }
    static void C(){
        System.out.println("This Is C");
    }

    public static void main(String[] args) {
        A();
        int p = 3;

        int mypi = (int) ((int) p * PI);

        System.out.println(mypi);

//        System.out.println(p.Math.PI);

    }
}
