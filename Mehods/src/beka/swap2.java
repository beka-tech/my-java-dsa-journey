package beka;

public class swap2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int[] swapped = swap(a, b);

        System.out.println("After swap: a = " + swapped[0] + ", b = " + swapped[1]);
    }

    static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}
