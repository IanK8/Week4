/*******
 * circle
 * Ian Kalotkin
 * 2/26/2024
 ******/
public class Circle
{
    public static void main(String[]args){
        double radius = 4.18;
        var area = Math.PI * (radius * radius);
        double circumference = 2 * radius * Math.PI;
        System.out.println("The area of the circle is " + area);
        System.out.println("The circumference of the circle is " + circumference);
    }
}
