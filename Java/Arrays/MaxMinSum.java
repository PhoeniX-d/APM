import java.util.Scanner;
public class MaxMinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        if(size <= 0){
            System.out.println("Invalid Array Size");
        }
        else{
            int[] arr = new int[size];
            System.out.println("Enter the array elements");
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int min = arr[0];
            int max = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(max < arr[i])
                    max = arr[i];
                if(min > arr[i])
                    min = arr[i];
            }
            System.out.println(max + min);
        }
        sc.close();
    }    
}
