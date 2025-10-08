package Block_Scope;

public class Scop1 {
    public static void main(String[] args) {
        int a =10;

        {
            a =100;
            System.out.println("First "+ a);
        }
        System.out.println("Second "+a);
    }
}
