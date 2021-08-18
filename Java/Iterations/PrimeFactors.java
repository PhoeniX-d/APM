import java.util.Scanner;

public class PrimeFactors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.close();
        // First take care of even numbers
        while(num % 2 == 0){
            System.out.println(2 + " ");
            num = num / 2;
        }

        // Now n is odd, and diff between prime factors must be atleast 2
        for(int i = 3; i <= Math.sqrt(num); i = i + 2){
            while(num % i == 0){
                System.out.print(i + " ");
                num = num / i;
            }
        }
        // For num is prime  > 2
        if(num > 2){
            System.out.print(num);
        }
    }
}