java.util.*;
public class ex1_div_and_mod {
    public static void main (String[] args){
        int integer1;
        int integer2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        integer1 = input.nextInt();
        System.out.print("Enter a second integer: ");
        integer2 = input.nextInt();
        int division1 = integer1 / integer2;
        int mod1 = integer1 % integer2;
        int division2 = integer2 / integer1;
        int mod2 = integer2 % integer1;

        System.out.println(integer1 + " / " + integer2 + " = " + division1);
        System.out.println(integer1 + " % " + integer2 + " = " + mod1);
        System.out.println(integer2 + " / " + integer1 + " = " + division2);
        System.out.println(integer2 + " % " + integer1 + " = " + mod2);
    }