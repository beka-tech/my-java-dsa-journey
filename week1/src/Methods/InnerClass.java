package Methods;

public class InnerClass {
//    public class innerMain {
//        public static int m1(int a, int b){
//            int sum =a+b;
//            return sum;
//        }
    static void sum(int a1,int a2){
        System.out.println(a1+a2);
    }
//    }
    public static void main(String[] args) {

         class innerMain {
            public static int m1(int a, int b){
                int sum =a+b;
                return sum;
            }
        }

        int result = innerMain.m1(2,3);
        System.out.println(result);

        sum(2,5);
    }
}
