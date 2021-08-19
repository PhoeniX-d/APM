import java.util.Scanner;
public class TestMain {

    public static BusTicket getTicketDetails(){
        BusTicket busticket = new BusTicket();
        Person person = new Person();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the passanger name:");
        String name = sc.nextLine();

        System.out.println("Enter the gender(M or F / m or f):");
        char gender = sc.next().charAt(0);

        System.out.println("Enter the age:");
        int age = sc.nextInt();

        System.out.println("Enter the ticket no:");
        int ticketno = sc.nextInt();

        System.out.println("Enter the ticket price:");
        float ticketprice = sc.nextFloat();

        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        busticket.setPerson(person);
        busticket.setTicketNo(ticketno);
        busticket.setTicketPrice(ticketprice);

        sc.close();
        return busticket;
    }
    public static void main(String[] args) {
        BusTicket ticket = getTicketDetails();
        ticket.calculateTotal();
        System.out.println("Ticket no:" + ticket.getTicketNo());
        System.out.println("Passenger Name:" + ticket.getPerson().getName());
        System.out.println("Price of a ticket:" + ticket.getTicketPrice());
        System.out.println("Total Amount:" + ticket.getTotalAmount());
    }
}
