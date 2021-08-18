import java.util.Scanner;
public class PowerOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Enter the digit");
        byte digit = sc.nextByte();
        sc.close();
        if(number >= 0 && digit >= 0){
            long power = 1L;
            for (int i = 1; i <= digit; i++){
                power = power * number;
            }
            System.out.println(power);
        }
        else{
            System.out.println("Invalid Input");
        }
       
    }
}