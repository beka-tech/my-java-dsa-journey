package Day2;
class Car {
    int year;
    String brand;


    public Car(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }
    void display(){
        System.out.println("My Car" +year+" " + brand);
    }
}
public class my {
    public static void main(String[] args) {
        Car myCar = new Car(2009,"Toyota");
        myCar.display();
        int If = 23;
        System.out.println(If);
    }
}
