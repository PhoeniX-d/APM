import java.util.Scanner;

public class NumberRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int number = sc.nextInt();

        System.out.print("Enter the key digit ");
        byte key = sc.nextByte();
        sc.close();

        byte count = 0;
        int temp = number;
        if (number >= 0) {
            while (number > 0) {
                if((number % 10) == key){
                    count++;
                }
                number = number / 10;
            }
            System.out.println(key + " appears " + count + " times in " + temp);    
        }
        
    }
}