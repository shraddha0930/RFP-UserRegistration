import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidations {
    static Scanner scanner = new Scanner(System.in);
    public void username() {
        System.out.println("Enter First Name");
        Pattern pattern = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
        String firstName = scanner.next();
        Matcher matcher = pattern.matcher(firstName);
        System.out.println("Enter Last Name");
        String lastName = scanner.next();
        Matcher matcher1 = pattern.matcher(lastName);
        if(matcher.matches()){
            if (matcher1.matches())
            System.out.println("Valid Name");
        }else
            System.out.println("Invalid Name");

    }
    public void useremail() {
        System.out.println("Enter EmailId");
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([.][a-zA-Z0-9]*)?[@][a-zA-Z0-9]+[.][a-z]{2,}([.][a-zA-Z]{2,})?$");
        String email = scanner.next();
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
                System.out.println("Valid Name");
        }else
            System.out.println("Invalid Name");

    }

}
