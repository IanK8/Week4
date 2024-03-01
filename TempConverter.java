import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args){
        double F;
        Scanner input = new Scanner(System.in);
       
        System.out.print("Fahrenheit: ");
        F = input.nextDouble();
        //input.close();
        double C = 5.0 / 9.0 * (F - 32);
        System.out.print("Your degree in Celsius is " + C);

    }
}
