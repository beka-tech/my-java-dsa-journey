package Com.beka;

public class revers2 {
    public static void main(String[] args) {
        int n = 1234;
        int ans = 0;

        while (n>0){
            int remnd = n%10;
            ans = ans*10 +remnd;
            n/=10;
        }
        System.out.println(ans);
    }
}
