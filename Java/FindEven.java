import java.util.Scanner;

public class FindEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is an even number");
        }
        sc.close();
    }
}