public class Ticket {
    private int ticketid;
    private int price;
    private static int availableTicket;
    public int getTicketid() {
        return ticketid;
    }
    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static int getAvailableTicket() {
        return availableTicket;
    }
    public static void setAvailableTicket(int availableTicket) {
        if(availableTicket > 0){
            Ticket.availableTicket = availableTicket;
        }
    }
    public int calculateTicketCost(int nooftickets){
        int total_amount = -1;
        if(nooftickets <= Ticket.availableTicket){
            total_amount = nooftickets * this.price;
            Ticket.availableTicket = Ticket.availableTicket - nooftickets;
        }
        return total_amount;
    }
}