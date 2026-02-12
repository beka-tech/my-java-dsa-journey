package String;

public class UsernameValidator {
    public static boolean isValidUsername(String username){

        boolean hasletterat0 = true;
        boolean haslettergreaterfiveandlessfifteen = true;
        boolean hasLetterorDigits = true;

        if(!Character.isLetter(username.charAt(0))){
            hasletterat0= false;
        }
        if(username.length() < 5 || username.length() > 15){
            haslettergreaterfiveandlessfifteen = false;
        }
        for (char c : username.toCharArray()){
            if(!Character.isLetterOrDigit(c)){
                hasLetterorDigits = false;
            }
        }
        return hasletterat0&&haslettergreaterfiveandlessfifteen&&hasLetterorDigits;
    }
    public static void main(String[] args) {
        System.out.println(isValidUsername("john123"));   // true
        System.out.println(isValidUsername("john123"));   // true
        System.out.println(isValidUsername("12john"));    // false
        System.out.println(isValidUsername("jo hn"));     // false
        System.out.println(isValidUsername("john12!"));   // false


    }
}
