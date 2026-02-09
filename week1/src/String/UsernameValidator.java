package String;

public class UsernameValidator {
    public static boolean isValidUsername(String username){
        if(!Character.isLetter(username.charAt(0))){
            return false;
        }
        if(username.length() < 5 || username.length() > 15){
            return false;
        }
        for (char c : username.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isValidUsername("john123"));   // true
        System.out.println(isValidUsername("john123"));   // true
        System.out.println(isValidUsername("12john"));    // false
        System.out.println(isValidUsername("jo hn"));     // false
        System.out.println(isValidUsername("john12!"));   // true

    }
}
