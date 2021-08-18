import java.util.Scanner;

public class FindFactors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num == 0){
            System.out.println("No Factors");
        }
        else{
            num = num < 0 ? -num : num;
            for(int i = 1; i <= num / 2; i++){
                if(num % i == 0){
                    System.out.print(i + ", ");
                }
            }
            System.out.println(num);
        }
        
    }
}