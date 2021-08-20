import java.util.Scanner;

public class TicketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of bookings:");
        int bookings = sc.nextInt();
        System.out.println("Enter the available tickets:");
        int availableTicket = sc.nextInt();
        Ticket.setAvailableTicket(availableTicket);
        while(bookings > 0){
            System.out.println("Enter the ticketid:");
            int ticketid = sc.nextInt();
            
            System.out.println("Enter the price:");
            int price = sc.nextInt();

            System.out.println("Enter the no of tickets:");
            int  nooftickets = sc.nextInt();

            System.out.println("Available tickets:" + Ticket.getAvailableTicket());

            Ticket t = new Ticket();
            t.setTicketid(ticketid);
            t.setPrice(price);
            
            System.out.println("Total amount:" + t.calculateTicketCost(nooftickets));

            System.out.println("Available tickets after booking:" + Ticket.getAvailableTicket());
            bookings--;
        }
        sc.close();
    }
}
