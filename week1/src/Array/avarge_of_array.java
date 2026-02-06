package Array;

public class avarge_of_array {
    public static void main(String[] args) {

        int arrs[] = {2, 8 };

            int i;
            int sum = 0;

            for( i =0; i < arrs.length;i++ ){
                sum+=arrs[i];
            };
            int avg;
             avg = sum /arrs.length;
            System.out.println(avg);

    }
}
