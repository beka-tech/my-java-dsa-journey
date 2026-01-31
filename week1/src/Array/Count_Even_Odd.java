package Array;

public class Count_Even_Odd {
    public static void main(String[] args) {
        int arrs[] = {3, 8, 11, 14, 20};

        int Evencout = 0;
        int Oddcout = 0;
        for (int i = 0; i <arrs.length ; i++) {
            if (arrs[i]%2 ==0) {
                Evencout++;
            } else if (arrs[i] %2 != 0) {
                Oddcout++;
            }
        }
        System.out.println(" Even "+ Evencout);
        System.out.println(" Odd " +Oddcout);
    }
}
