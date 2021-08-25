import java.util.Scanner;
public class SortArrayElementDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the values");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        int temp = 0;
        boolean sort = false;
        for(int i = 1; i < array.length; i++){
            sort = false;
            for(int j = 0; j < array.length - i; j++){
                if(array[j] < array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sort = true;
                }
            }
            if(sort == false)
                break;
        }
        System.out.println("Sorted array");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
