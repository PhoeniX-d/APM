import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        if(size <= 0){
            System.out.println("Array size should be greater than 0");
            sc.close();
            return;
        }
        System.out.println("Enter the elements");
        int[] elements = new int[size];
        for(int i = 0; i < elements.length; i++){
            elements[i] = sc.nextInt();
        }
        int[] result = sortArray(elements);
        for(int i = 0; i < elements.length; i++){
            System.out.println(result[i]);
        }
        sc.close();
    }

    public static int[] sortArray(int[] elements){
        int mid = elements.length / 2;
        int temp = 0;
        boolean sort = false;
        for(int pass = 1; i < mid; pass++){
            sort = false;
            for(int i = 0; i < mid - pass; i++){
                if(elements[i] > elements[i + 1]){
                    temp = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = temp;
                    sort = true;
                }
            }
            if(sort == false)
                break;
        }

        for(int pass = mid + 1; i < elements.length; pass++){
            sort = false;
            for(int i = mid + 1; i < elements.length - pass; i++){
                if(elements[i] < elements[i + 1]){
                    temp = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = temp;
                    sort = true;
                }
            }
            if(sort == false)
                break;
        }
        return elements;
    }
}
