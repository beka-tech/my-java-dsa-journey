package String;

public class StringBuffer_Example {
    public static void main(String[] args) {
        StringBuffer demo = new StringBuffer("Beka");
        System.out.println(demo);
        String str1 = "Beka";
        demo.append("A");
        System.out.println(demo);

        StringBuffer sb1 = new StringBuffer("");
        sb1.append("A");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("");
        sb2.append("B");
        System.out.println(sb2);
    }
}
