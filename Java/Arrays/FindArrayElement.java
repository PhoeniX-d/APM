import java.util.Scanner;
public class FindArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number to find");
        int number = sc.nextInt(), i = 0, j = 0;
        for( i = 0, j = array.length - 1; i < j; i++, j--){
            if(array[i] == number || array[j] == number){
                break;
            }
        }if(j <= i){
            System.out.println("0");
        }
        else if(array[i] == number){
            System.out.println(i + 1);;
        }else if(array[j] == number){
            System.out.println(j + 1);
        }
        sc.close();
    }
}
