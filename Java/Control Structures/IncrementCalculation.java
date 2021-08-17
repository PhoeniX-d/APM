import java.util.Scanner;

public class IncrementCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        float sal = sc.nextFloat();
        System.out.println("Enter the Performance appraisal rating");
        float appraisal = sc.nextFloat();
        sc.close();
        if(sal <= 0 || appraisal < 1 || appraisal > 5){
            System.out.println("Invalid Input");
        }
        else{
            if(appraisal >= 1 && appraisal <= 3){
                System.out.println((int)(sal + sal * 0.1));
            }
            else if(appraisal >= 3.1 && appraisal <= 4){
                System.out.println((int)(sal + sal * 0.25));
            }
            else if(appraisal >= 4.1 && appraisal <= 5){
                System.out.println((int)(sal + sal * 0.3));
            }
        }
    }
}
