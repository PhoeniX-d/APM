import java.util.Scanner;

public class PrimeRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        if(start >= 0 && end >= 0 && start < end && (end - start) > 0){
            for(int i = start; i <= end; i++){
                if(isPrime(i) && i != 1){
                    System.out.print(i + " ");
                }
            }
        }
        else{
            System.out.println("Provide valid input");
        }     
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