import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units consumed");
        int units = sc.nextInt();
        float charges = 0.0f;
        if(units <= 20){
            System.out.println("No Charge");
        }
        else if(units > 20 && units < 100){
            charges = units * 3.50f;
            System.out.println("You have to pay Rs." + charges);
        }
        else if(units >= 100){
            charges = units * 5.0f;
            System.out.println("You have to pay Rs." + charges);
        }
        sc.close();
    }
}