import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        int tickets = sc.nextInt();
        if (tickets < 5 || tickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        } else {
            System.out.println("Do you want refreshments:");
            String refreshment = sc.next();

            System.out.println("Do you have coupon code:");
            String coupon = sc.next();

            System.out.println("Enter the circle:");
            String circle = sc.next();
            float cost = 0.0f;
            switch (circle) {
                case "k":
                    cost = tickets * 75;
                    if(tickets > 20){
                        cost = (float)(cost - (cost * 0.1));
                    }
                    if(coupon.equals("y")){
                        cost = (float)(cost - (cost * 0.02));
                    }
                    if(refreshment.equals("y")){
                        cost = cost + tickets * 50;
                    }
                    System.out.println(String.format("Total cost:%.2f", cost));
                    break;
                case "q":
                    cost = tickets * 150;
                    if(tickets > 20){
                        cost = (float)(cost - (cost * 0.1));
                    }
                    if(coupon.equals("y")){
                        cost = (float)(cost - (cost * 0.02));
                    }
                    if(refreshment.equals("y")){
                        cost = cost + tickets * 50;
                    }
                    System.out.println(String.format("Total cost:%.2f", cost));
                    break;
                default:
                    System.out.println("Invlid Input");
            }           
        }
        sc.close();
    }
}