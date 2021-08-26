import java.util.Scanner; 
public class ArrayCompatibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of First array:");
        int firstSize = sc.nextInt();
        if(firstSize <= 0){
            System.out.println("Invalid array size");
            sc.close();
            return;
        }
        int[] first = new int[firstSize];
        System.out.println("Enter the elemets for First array:");
        for(int i = 0; i < first.length; i++){
            first[i] = sc.nextInt();
        }

        System.out.println("Enter the size of Second array:");
        int secondSize = sc.nextInt();
        if(firstSize <= 0){
            System.out.println("Invalid array size");
            sc.close();
            return;
        }
        int[] second = new int[secondSize];
        System.out.println("Enter the elemets for Second array:");
        for(int i = 0; i < second.length; i++){
            second[i] = sc.nextInt();
        }
        if(firstSize != secondSize){
            System.out.println("Arrays are no Compatible");
            sc.close();
            return;
        }
        boolean compatibility = isCompatible(first, second);
        if(compatibility)
            System.out.println("Arrays are Compatible");
        else 
            System.out.println("Arrays are not Compatible");
        sc.close();
    }

    public static boolean isCompatible(int[] a, int[]b){
        if(a == null && b == null)
            return false;
        int i = 0;
        for(i = 0; i < a.length; i++){
            if(a[i] < b[i])
                break;
        }
        if(i == a.length)
            return true;
        else
            return false;
    }
}
