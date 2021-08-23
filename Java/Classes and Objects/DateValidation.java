import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class DateValidation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strDate = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try{
            Date javaDate = sdf.parse(strDate);
            System.out.printf(strDate + " is a valid date");
        }
        catch(ParseException e){
            System.out.println(strDate + " is not a valid date");
        }
        sc.close();
    }
}
