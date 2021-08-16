import java.util.Scanner;
public class CarDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car name:");
        String carname = sc.nextLine();
        System.out.println("Enter the car no:");
        int carno = sc.nextInt();
        System.out.println("Enter the price:");
        float carprice = sc.nextFloat();

        System.out.println("Carname:" + carname);
        System.out.println("Carno:" + carno);
        System.out.println(String.format("Price:%.2f rs only", carprice));
        sc.close();
    }
}