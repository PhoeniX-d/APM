import java.util.Scanner;

public class IsPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if(number < 0){
            System.out.println("Invalid Input");
        }
        else{
            if(isPalindrome(number)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not a Palindrome");
            }
        }       
    }

    public static boolean isPalindrome(int num){
        int rev = 0, temp = num;
        if(num < 9){
            return true;
        }
        while(temp > 0){
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
        if(rev == num){
            return true;
        }
        else{
            return false;
        }
    }
}
