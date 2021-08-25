import java.util.Scanner;
public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        if(size <= 0){
            System.out.println("Invalid array size");
        }
        else{
            int[] arr = new int[size + 1];
            System.out.println("Enter the array elements");
            for(int i = 0; i < arr.length - 1; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the position of the element to be replicated:");
            int pos = sc.nextInt();
            if(pos < 0 || pos >= arr.length - 1){
                System.out.println("Position is greater than the size of an array");
            }
            else{
                arr[arr.length - 1] = arr[pos];
                for(int i = 0; i < arr.length; i++){
                    System.out.println(arr[i]);
                }
            }
        }
        sc.close();
    }    
}
