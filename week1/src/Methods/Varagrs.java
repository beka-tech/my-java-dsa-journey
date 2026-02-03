package Methods;

public class Varagrs {
    static void add_two(int... number){
        for (int i = 0; i < number.length; i++) {

            System.out.println(number[i] * 2);
        }
    }
    public static void main(String[] args) {

        int[] arrs = {2, 2, 2, 2, 2, 2, 2, 2};

        add_two(arrs);
    }
}
