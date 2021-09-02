import java.util.Scanner;
public class FactorialSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        if(size <= 0){
            sc.close();;
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter the elements");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        int fact = 1, sum = 0;
        for(int i = 0; i < size; i++){
            if(array[i] > 0 && array[i] <= 9){
                fact = 1;
                for(int j = 1; j <= array[i]; j++)
                    fact = fact * j;
                sum = sum + fact;
            }
        }
        if(sum == 0)
            System.out.println("No positive and single digit numbers found in an array");
        else
            System.out.println(sum);
        sc.close();
    }
}
