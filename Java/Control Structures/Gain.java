import java.util.Scanner;

public class Gain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Price of old scooter:");
        int old_price = sc.nextInt();
        System.out.println("The amount spent for repair:");
        int repair_amt = sc.nextInt();
        System.out.println("Sold Price:");
        int sold_price = sc.nextInt();
        int invested_price = old_price + repair_amt;
        if(old_price <= 0 || sold_price <= 0 || repair_amt < 0){
            System.out.println("Incorrect Inputs");
        }
        else if(sold_price < invested_price){
            System.out.println("Unable to calculate Gain Percentage");
        }
        else{
            int gain = sold_price - invested_price;
            System.out.printf("Gain Percentage is %.2f", ((float)gain / invested_price) * 100);
        }

        sc.close();
    }
}