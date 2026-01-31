package Array;

public class Reverse_An_Array {
    public static void main(String[] args) {
        int arrs []={1,2,3,4,5};
        int j = arrs.length-1;

        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[j-i]+" ");
        }
    }
}
