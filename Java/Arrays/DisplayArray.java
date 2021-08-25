import java.util.Scanner;
public class DisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        for(int element : array){
            System.out.println(element);
        }
        sc.close();
    }
}
