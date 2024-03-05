import java.util.*;
public class AccountSetup {
    public static void main(String[] args){
        String name;
        String password;
        Scanner input = new Scanner(System.in);
        System.out.println("Name: ");
        name = input.nextLine();
        System.out.println("Password: ");
        password = input.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Your password is " + password);
    }
}
