package beka;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swapIt(a, b);
        System.out.println("Before Swap a = 10 , b = 20");
    }

    static void swapIt(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside method: a = " + a + ", b = " + b);
    }
}
