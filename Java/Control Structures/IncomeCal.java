import java.util.Scanner;
public class IncomeCal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of hours worked in a day:");       
        byte hours = sc.nextByte();
        if(hours < 0 || hours > 24){
            System.out.println("Unable to calculate the earnings");
        }
        else{
            System.out.println("Total incomr i a year:" + (hours * 365 * 100));
        }
        sc.close();
    }
}