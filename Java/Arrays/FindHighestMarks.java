import java.util.Scanner;
public class FindHighestMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];
        int i = 0;
        for(i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
            if(array[i] < 0 || array[i] > 100){
                System.out.println("Invalid Mark");
                break;
            }
        }
        if(i == 6){
            int maxMarks = array[0];
            for(i = 0; i < array.length; i++){
                if(maxMarks < array[i])
                    maxMarks = array[i];
            }
            System.out.println("Highest mark is " + maxMarks);
        }
        sc.close();
    }
}
