import java.util.Scanner;
public class FindAvgAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no.of employees:");
        int employees_count = sc.nextInt();
        if(employees_count < 2)
            System.out.println("Please enter a valid employee count");
        else{
            int ages[] = new int[employees_count];
            int i = 0;
            int sum = 0;
            float avg = 0.0f;
            System.out.println("Enter the age for " + employees_count + " employees:");
            for(i = 0; i < ages.length; i++){
                ages[i] = sc.nextInt();
                if(ages[i] < 28 || ages[i] > 40){
                    System.out.println("Invalid age encountered!");
                    break;
                }
                else{
                    sum = sum + ages[i];
                }
            }
            if(i == ages.length){
                avg = (float)sum / employees_count;
                System.out.printf("The average age is %.2f", avg);
            }
        }
        sc.close();
    }
}
