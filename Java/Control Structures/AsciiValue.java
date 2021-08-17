import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int i = 0, digit[] = new int[4];
        while(i < 4){
            digit[i++] = sc.nextInt();
        }
        sc.close();
        for(i = 0; i < 4; i++){
            System.out.println(digit[i] + "-" + (char)digit[i]);
        }       
    }
}
