import java.util.Scanner;
public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if(number > 0 && number <= 100){
            System.out.println("Range of the number " + number + " is 0 to 100");
        }
        else if(number > 100 && number <= 200){
            System.out.println("Range of the number " + number + " is 100 to 200");
        }
        else if(number > 200 && number <= 500){
            System.out.println("Range of the number " + number + " is 200 to 500");
        }
        else{
            System.out.println("Enterd number " + number + " is not in the expected range");
        }
        sc.close();
    }
}
