package Methods;


public class Overloading {

       static void f(long x){
            System.out.println(x*x);
        }
       static void f(Integer x){
            System.out.println("Integer");
        }
       static void f(float x){
            System.out.println("Float");
        }
       static void f(int... x){
           System.out.println("array");
       }

    public static void main(String[] args) {

        int i = 5;
        f(i);
        f((Integer) 12345);
        float flo = 12.34f;
        f(flo);
        int [] arr = {1,2,3,4,5};
        f(arr);
    }
}
