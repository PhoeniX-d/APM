import java.util.Scanner;
public class PassFailCount {

    public static final int MAX_SIZE = 20;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of subjects");
        int subjects = sc.nextInt();
        if(subjects > MAX_SIZE || subjects <= 0){
            System.out.println("Invalid input range");
        }
        else{
            int passCount = 0, failCount = 0;
            int[] marks = new int[subjects];
            for(int i = 0; i < marks.length; i++){
                marks[i] = sc.nextInt();
                if(marks[i] >= 0 && marks[i] <= 100){
                    if(marks[i] > 50)
                        passCount++;
                    else if(marks[i] < 50)
                        failCount++;

                }
            }
            if(failCount == 0)
                System.out.println("Ram passed in all subjects");
            else if(passCount == 0)
                System.out.println("Ram failed in all subjects");
            else
                System.out.println("Ram passed in " + passCount + " subjects and failed in " + failCount + " subjects");
        }
        
        sc.close();
    }
}
