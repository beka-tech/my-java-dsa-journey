package Com.beka;

public class counting_occurrences {
    public static void main(String[] args) {
        int n = 1385757879;
        int count = 0;

        while (n > 0){
            int remd = n%10;
            if (remd == 7){
                count +=1;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
