import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int size = sc.nextInt();
        if(size <= 0){
            System.out.println("Invalid Range");
            sc.close();
            return;
        }
        System.out.println("Enter the elements");
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int c_sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <= i; j++){
                c_sum = c_sum + arr[j];
            }
            System.out.print(c_sum + " ");
            c_sum = 0;
        }
        sc.close();
    }
}
