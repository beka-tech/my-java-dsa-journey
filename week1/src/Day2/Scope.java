package Day2;
  class User{
    String name = "Class Field";
    void PrintName(){
        String name = "Local Variable";
        System.out.println(name);
        System.out.println(this.name);
    }
}

public class Scope {
    public static void main(String[] args) {
        User newUsers = new User();
       newUsers.PrintName();
    }
}
