import java.util.Scanner;
public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int firstSize = sc.nextInt();
        if(firstSize <= 0){
            System.out.println("Invalid array size");
            sc.close();
            return;
        }
        System.out.println("Enter elements for first array");
        int[] first = new int[firstSize];
        for(int i = 0; i < first.length; i++){
            first[i] = sc.nextInt();
        }

        System.out.println("Enter the size of second array:");
        int secondSize = sc.nextInt();
        if(secondSize <= 0){
            System.out.println("Invalid array size");
            sc.close();
            return;
        }
        System.out.println("Enter elements for second array");
        int[] second = new int[secondSize];
        for(int i = 0; i < second.length; i++){
            second[i] = sc.nextInt();
        }
        int thirdSize = firstSize > secondSize ? firstSize : secondSize;
        int[] third = new int[thirdSize];
        int i = 0;
        for(i = 0; i < first.length && i < second.length; i++){
            third[i] = first[i] + second[i];
        }
        while(i < first.length){
            System.out.println("in First array");
            third[i] = first[i];
            i++;
        }
        while(i < second.length){
            System.out.println("in Second array");
            third[i] = second[i];
            i++;
        }
        for(int j = 0; j < third.length; j++){
            System.out.print(third[j] + " ");
        }
        sc.close();
    }
}
