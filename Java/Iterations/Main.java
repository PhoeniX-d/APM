import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println("Enter the number");
        int number = sc.nextInt();
        sc.close();

        if(number < 1){
            System.out.println(number + " is not a valid input");
        }
        else{
            for(int i = 1; i <= number; i++){
                System.out.println(str);
            }
        }
    }
}