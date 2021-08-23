import java.text.*;
import java.util.*;


public class CalculateExpiryDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strDate = sc.next();
        int months = sc.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date date = sdf.parse(strDate);
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.MONTH, months);
            Date expiry = c.getTime();
            String sDate = sdf.format(expiry);
            System.out.println(sDate);
        }
        catch(ParseException e){
            System.out.println("ParseException");
        }
        sc.close();
    }   
}
