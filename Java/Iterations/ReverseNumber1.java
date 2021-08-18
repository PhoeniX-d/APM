import java.util.Scanner;

public class ReverseNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int reverse_number = 0;
       
        if (number >= 0) {
            while (number > 0) {
                reverse_number = 10 * reverse_number + (number % 10);
                number = number / 10;
            }
            System.out.println("Output is:" + reverse_number);    
        } else {
            System.out.println("Number should be positive");
        }
        sc.close();
    }
}