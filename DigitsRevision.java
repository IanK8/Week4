import java.util.*;
public class DigitsRevision {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 3 digit number: ");
        number = input.nextInt();
        input.close();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        
        System.out.println("The hundreds-place digit is: " + hundreds);
        System.out.println("The tens-place digit is: " + tens);
        System.out.println("The one's digit is: " + ones);
    }
}