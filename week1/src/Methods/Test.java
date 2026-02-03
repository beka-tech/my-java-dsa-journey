package Methods;


class Animal {
   static void eat() {
        System.out.println("Animal Eats");
    }

    void sleep() {
        System.out.println("Animal Sleep");
    }
}
class Dog extends Animal {
    static   void eat() {
        System.out.println("Dog eats");
    }

    void sleep() {
        System.out.println("Dog Sleeps");
    }
}
    public class Test {

        public static void main(String[] args) {

                Animal a = new Dog();
                a.eat();
                a.sleep();

        }
    }
