package String;

public class PassWordValidator {
    public static boolean isStrongPassword(String password){
        boolean hasLonger = false;
        boolean hasLoweCase = false;
        boolean hasUpper = false;
        boolean hasDigit =false ;
        boolean hasspecialChar = false;

        if(!(password.length() >8)){
            hasLonger = true;
        }
        for(char c:password.toCharArray()){
            if(Character.isLowerCase(c) ){
                hasLoweCase = true;
            }
            if(Character.isUpperCase(c)){
                hasUpper = true;
            }
            if(Character.isDigit(c)){
                hasDigit = true;
            } else if ("!@#$%^&*" .indexOf(c) >0) {
                hasspecialChar = true;
            }
        }
        return hasLonger&&hasLoweCase&&hasUpper&hasDigit&hasspecialChar;
    }
    public static void main(String[] args) {
        System.out.println(isStrongPassword("Abc123!@"));  // true
        System.out.println(isStrongPassword("Abc123!@"));  // true
        System.out.println(isStrongPassword("abc123"));    // false
        System.out.println(isStrongPassword("ABC123!"));   // false

    }
}
