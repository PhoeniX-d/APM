import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the first array :");
        int firstCount = sc.nextInt();
        if (firstCount >= 0) {
            System.out.println("Enter the elements in the first array");
            int[] first = new int[firstCount];
            for (int i = 0; i < first.length; i++) {
                first[i] = sc.nextInt();
            }

            System.out.println("Enter the elements in the second array :");
            int secondCount = sc.nextInt();
            if (secondCount >= 0) {
                if (secondCount == firstCount) {
                    System.out.println("Enter the elements in the second array");
                    int[] second = new int[secondCount];
                    for (int i = 0; i < second.length; i++) {
                        second[i] = sc.nextInt();
                    }
                    sc.close();
                    for (int i = 0; i < first.length; i++) {
                        first[i] = first[i] + second[i];
                        second[i] = first[i] - second[i];
                        first[i] = first[i] - second[i];
                    }

                    System.out.println("The First array after swapping is :");
                    for (int i = 0; i < first.length; i++) {
                        System.out.print(first[i] + " ");
                    }
                    System.out.println();
                    System.out.println("The Second array after swapping is :");
                    for (int i = 0; i < second.length; i++) {
                        System.out.print(second[i] + " ");
                    }
                } else {
                    System.out.println("Unble to swap size differs");
                }

            } else {
                System.out.println("Invalid range");
            }
        } else {
            System.out.println("Invalid range");
        }
    }
}
