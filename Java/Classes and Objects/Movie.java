public class Movie {
    private String movieName;
    private String movieCategory;
    private int ticketCost;

    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getMovieCategory() {
        return movieCategory;
    }
    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }
    public int getTicketCost() {
        return ticketCost;
    }
    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }
    public int calculateTicketCost(String circle){
        boolean invalidCategory = (!this.movieCategory.equalsIgnoreCase("2D") && !this.movieCategory.equalsIgnoreCase("3D"))? true : false ;
        boolean invalidCircle = (!circle.equalsIgnoreCase("gold") && !circle.equalsIgnoreCase("silver")) ? true : false;
        
        if(invalidCategory && invalidCircle)
            return -3;
        else if(invalidCategory)
            return -1;
        else if(invalidCircle)
            return -2;
        else {
            if(this.movieCategory.equalsIgnoreCase("2D") && circle.equalsIgnoreCase("gold"))
            this.ticketCost = 300;
        else if(this.movieCategory.equalsIgnoreCase("3D") && circle.equalsIgnoreCase("gold"))
            this.ticketCost = 500;
        else if(this.movieCategory.equalsIgnoreCase("2D") && circle.equalsIgnoreCase("silver"))
            this.ticketCost = 250;
        else if(this.movieCategory.equalsIgnoreCase("3D") && circle.equalsIgnoreCase("silver"))
            this.ticketCost = 450;
        return 0;
        }
    }
}
