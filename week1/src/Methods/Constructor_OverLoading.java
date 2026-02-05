package Methods;
class Box{
    double width;
    double height;
    double depth;

    Box(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }

    Box(double l){
        width = height = depth = l;
    }
 /* for rectangle */
 Box(double l, double w){
        width = l;
        height = w;
        depth = 1;
    }

    int volume(){
        return (int) (width*height*depth);
    }


}
public class Constructor_OverLoading {
    public static void main(String[] args) {

        Box b1 =  new Box(10,20,30);
        int vol1;
        vol1 = b1.volume();
        System.out.println(vol1);

        Box b2 = new Box(20);
        int vol2;
        vol2 = b2.volume();
        System.out.println(vol2);

        Box b3 = new Box(20,30);
        int vol3;
        vol3 = b3.volume();
        System.out.println(vol3);

    }
}
