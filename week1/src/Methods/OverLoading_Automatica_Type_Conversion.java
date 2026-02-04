package Methods;

public class OverLoading_Automatica_Type_Conversion {

    static void cast(short x){
        System.out.println("Double" +x);
    }
    static void cast(int x){
        System.out.println("Long " +x);
    } static void cast(long x){
        System.out.println("Long " +x);
    }

    public static void main(String[] args) {
        cast(123456789L);
    }
}
