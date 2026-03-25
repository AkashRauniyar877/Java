import java.util.Scanner;

class Validation {

    
    static void checkUsername(String username) throws Exception {
        if (username.length() < 5 || username.contains(" ") ) {
            throw new Exception("Invalid Username (min 5 chars, no spaces)");
        }
    }


    static void checkMobile(String mobile) throws Exception {

    if (mobile.length() != 10) {
        throw new Exception("Invalid: must be 10 digits");
    }

    if (mobile.charAt(0) == '0') {
        throw new Exception("Invalid: should not start with 0");
    }

    for (int i = 0; i < mobile.length(); i++) {
        if (!Character.isDigit(mobile.charAt(i))) {
            throw new Exception("Invalid: only digits allowed");
        }
    }

    System.out.println("Valid Mobile Number");
}


    static void checkEmail(String email) throws Exception {
        if (!email.contains("@") || !email.contains(".")) {
            throw new Exception("Invalid Email format");
        }
    }
}

public class userDefineException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            Validation.checkUsername(username);

            System.out.print("Enter mobile: ");
            String mobile = sc.nextLine();
            Validation.checkMobile(mobile);

            System.out.print("Enter email: ");
            String email = sc.nextLine();
            Validation.checkEmail(email);

            System.out.println("All inputs are valid!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
