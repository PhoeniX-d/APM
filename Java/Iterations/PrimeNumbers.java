import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting range");
        int start = sc.nextInt();
        System.out.println("Enter ending range");
        int end = sc.nextInt();
        int count = 0;
        if(start > 0 && end > 0 && start < end){
            for(int i = start; i <= end; i++){
                if(isPrime(i)){
                    ++count;
                }
            }
        }
        System.out.println(count);
        sc.close();
       
    }

    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }
        if(num % 2 == 0){
            return false;
        }
        boolean flag = true;
        for(int i = 3; i <= Math.sqrt(num) + 1; i = i + 2){
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}