import java.util.Scanner;
public class CelsiusConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celsius = sc.nextFloat();
        float farenheit = (9 * celsius) / 5 + 32;
        System.out.println(String.format("%.1f",farenheit));
        sc.close();
    }
}