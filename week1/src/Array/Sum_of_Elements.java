package Array;

public class Sum_of_Elements {
    public static void main(String[] args) {
        int [] arrs = new int[8];
        arrs[0] =2 ;
        arrs[1] =2 ;
        arrs[2] =2 ;
        arrs[3] =2 ;
        arrs[4] =2 ;
        arrs[5] =2 ;
        arrs[6] =2 ;
        arrs[7] =2 ;
        int arr = 0;
        for (int i = 0; i <arrs.length ; i++) {
            arr += arrs[i];
        }
        System.out.println(arr);

    }
}
