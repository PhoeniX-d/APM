import java.util.Scanner;

public class PalindromeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting range");
        int start = sc.nextInt();
        System.out.println("Enter ending range");
        int end = sc.nextInt();
        if(start > 0 && end > 0 && start < end){
            for(int i = start; i <= end; i++){
                if(isPalindrome(i)){
                    System.out.print(i + " ");
                }
            }
        }
        sc.close();
       
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