import java.util.Scanner;

public class BillGeneration {

    private static final int PRICE_OF_PIZZA = 100;
    private static final int PRICE_OF_PUFFS = 20;
    private static final int PRICE_OF_COOLDRINK = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of pizzas bought:");
        int pizzas = sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puffs = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int cooldrinks = sc.nextInt();
        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + pizzas);
        System.out.println("No of puffs:" + puffs);
        System.out.println("No of cooldrinks:" + cooldrinks);
        int total_bill = PRICE_OF_PIZZA * pizzas + PRICE_OF_COOLDRINK * cooldrinks + PRICE_OF_PUFFS * puffs;
        System.out.println("Total price=" + total_bill + "\nENJOY THE SHOW!!!!");
        sc.close();
    }
}
