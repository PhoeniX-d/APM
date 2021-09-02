import java.util.*;
public class StringLength{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int strLen = string.length();
        if(strLen % 2 == 0)
            System.out.println(strLen + " Even");
        else
            System.out.println(strLen + " Odd");
        sc.close();
    }
}
