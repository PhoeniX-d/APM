import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        if (number < 0) {
            System.out.println("Invalid Input");
        }else if(number == 0 || number == 1) {
            System.out.println("1");
        }
        else {
            int n = 0;
            long fact = 1;
            while (fact < number) {
                n++;
                fact = fact * n;
            }
            if (fact == number) {
                System.out.println(n);
            } else {
                System.out.println("Sorry. The given number is not a perfect factorial");
            }
        }
        sc.close();
    }
}