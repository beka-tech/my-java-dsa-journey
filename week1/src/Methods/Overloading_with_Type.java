package Methods;

public class Overloading_with_Type {
    static void print(String s){
        System.out.println("String " +s);
    }
    static void print(int s){
        System.out.println("Int "+ s);
    }
    public static void main(String[] args) {

        print(3);
        print("SSH");
    }
}
