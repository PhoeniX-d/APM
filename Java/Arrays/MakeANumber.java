import java.util.Scanner;
public class MakeANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        if(size <= 0){
            System.out.println("Invalid array size");
            sc.close();
            return;
        }
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        int resultNum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 9 && arr[i] > 0 && ((arr[i] % 2) == 0)){
                resultNum = arr[i] + resultNum * 10;
            }
        }
        System.out.println(resultNum);
        sc.close();
    }
}
