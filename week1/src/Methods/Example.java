package Methods;

public class Example {
    public void printMessage(){
        System.out.println("Print Message");

    }
    static void sum(){
        int a = 2;
        int b = 4;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.printMessage();
        obj.sum();

    }
}
