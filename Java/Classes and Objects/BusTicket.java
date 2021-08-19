public class BusTicket{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;

    public int getTicketNo() {
        return ticketNo;
    }
    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }
    public float getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public float getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public void calculateTotal(){
        int passenger_age = this.getPerson().getAge();
        char gender = this.getPerson().getGender();
        if(passenger_age < 16){
            this.totalAmount = this.ticketPrice - this.ticketPrice * 0.5f;
        }
        else if(passenger_age >= 60){
            this.totalAmount = this.ticketPrice - this.ticketPrice * 0.25f;
        }
        else if(gender == 'F' || gender == 'f'){
            this.totalAmount = this.ticketPrice - this.ticketPrice * 0.1f;
        }
        else{
            this.totalAmount = this.ticketPrice;
        }
    }
}
