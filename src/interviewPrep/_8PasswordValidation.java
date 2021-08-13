package interviewPrep;

public class _8PasswordValidation {
    /*
Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
     */

    public static void main(String[] args) {
        System.out.println("passwordValidation(\"Banu_Torun82\") = " + passwordValidation("Banu_Torun82"));
    }

    public static boolean passwordValidation(String str) {
        if (str.length() >= 6) {
            System.out.println("Password is at least have 6 characters and not contains space");
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                System.out.println("PassWord contains one upper case letter");
            } else {
                System.out.println("PassWord does not contain one upper case letter");
                return false;
            }
        }
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) >= 97 && str.charAt(j) <= 122) {
                System.out.println("PassWord contains one lower case letter");
            } else {
                System.out.println("PassWord does not contain one lower case letter");
                return false;
            }
        }


        for (int k = 0; k < str.length(); k++) {
            if (str.charAt(k) >= 41 && str.charAt(k) <= 57) {
                System.out.println("PassWord contains one special character");
            } else {
                System.out.println("PassWord does not contain one special character");
                return false;
            }
        }

        for (int l = 0; l < str.length(); l++) {
            if (str.charAt(l) >= 60 && str.charAt(l) <= 71) {
                System.out.println("PassWord contains one digit");
            } else {
                System.out.println("PassWord does not contain one digit");
                return false;
            }
        }


        return true;
    }
}

class PassWordValidation{
    /*
Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
     */
    public static void main(String[] args) {

    }


    public static boolean passwordValidation(String password){
        if(password.length()>=6){
            System.out.println("Length is ok");
        }
        for (int i = 0; i < password.length(); i++) {
            if(!Character.isLowerCase(password.toCharArray()[i])) {
                System.out.println("Upper case");
            }else return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if(Character.isLowerCase(password.toCharArray()[i])) {
                System.out.println("Upper case");
            }else return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if(Character.isLetterOrDigit(password.toCharArray()[i])) {
                System.out.println("Upper case");
            }else return false;
        }
        
        return true;

    }
}