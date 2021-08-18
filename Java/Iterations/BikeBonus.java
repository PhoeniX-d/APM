import java.util.Scanner;

public class BikeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        int distance = sc.nextInt();
        sc.close();
        if (distance < 0) {
            System.out.println("Invalid input");
        if (distance == 0){
            System.out.println("Your bonus points is 0");
        }
        } else {
            int first_prod = 1;
            int second_prod = 1;
            while (distance > 0) {
                first_prod = first_prod * (distance % 10);
                distance = distance / 10;
                if(distance == 0)
                    break;
                second_prod = second_prod * (distance % 10);
                distance = distance / 10;
            }
            if (first_prod == second_prod) {
                System.out.println("Your bonus points is " + (first_prod + second_prod));
            } else if (first_prod > second_prod) {
                System.out.println("Your bonus points is " + first_prod);
            } else {
                System.out.println("Your bonus points is " + second_prod);
            }
        }
    }
}
