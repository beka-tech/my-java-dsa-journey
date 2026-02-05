package Methods;

class ObjectpassDemo {
    static int a,b;

     ObjectpassDemo(int i, int j) {
        a = i;
        b = j;
    }
      static void equalTo(ObjectpassDemo object){

//         return (object.a == a && object.b == b);
         System.out.println(object.a == a && object.b == b);

    }
}

public class Passing_Returning_Object {
    public static void main(String[] args) {

        ObjectpassDemo ob1 = new ObjectpassDemo(100,22);
        ObjectpassDemo ob2 = new ObjectpassDemo(100,22);
        ObjectpassDemo ob3 = new ObjectpassDemo(1010,212);

//        System.out.println(ob1.equalTo(ob2));
//        ob1.equalTo(ob2);
//        ob1.equalTo(ob3);

        System.out.println(ob1.equals(ob3));
//        System.out.println(ob1.b==ob2.b);
//
//
//        System.out.println(ob1.a +" "+ ob1.b);
//        System.out.println(ob2.a +" "+ ob2.b);
    }
}
