package Array;

public class Find_Largest_Number {
    public static void main(String[] args) {
        int [] arrs = new int[4];
        arrs[0] = 3;
        arrs[1] = 2;
        arrs[2] = 7;
        arrs[3] = 1;

        int max_int = 0;
        for (int i = 0; i < arrs.length; i++) {
            if(arrs[i]>max_int){
                max_int = arrs[i];
            }
        }
        System.out.println(max_int );
    }
}
