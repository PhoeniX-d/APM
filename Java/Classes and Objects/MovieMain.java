import java.util.Scanner;
public class MovieMain {
    public static Movie getMovieDetails(){
        Movie movie = new Movie();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name:");
        String movieName = sc.nextLine();
        System.out.println("Enter the movie category:");
        String movieCategory = sc.next();

        movie.setMovieName(movieName);
        movie.setMovieCategory(movieCategory);
        return movie;
    }
    public static String getCircle(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the circle:");
        String circle = sc.nextLine();
        sc.close();
        return circle;
    }
    public static void main(String[] args) {
        Movie movie = getMovieDetails();
        String circle = getCircle();
        int result = movie.calculateTicketCost(circle);
        System.out.println("Movie name = " + movie.getMovieName());
        System.out.println("Movie category = " + movie.getMovieCategory());
        if(result == 0){
            System.out.println("The ticket cost is = " + movie.getTicketCost());
        }
        else if(result == -1){
            System.out.println("Sorry there is no " + movie.getMovieCategory() + " type of category in theater.");
        }
        else if(result == -2){
            System.out.println("Sorry!!!! Circle is Invalid");
        }
        else if(result == -3){
            System.out.println("Sorry!!!! Both circle and cetegory are Invalid");
        }
    }
}
