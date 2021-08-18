import java.util.Scanner;
public class CoinsCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        byte age = sc.nextByte();
        if(age > 0){
            int coin_count = age * age * age;
            System.out.println("Meenu gets " + coin_count + " coins");
        }
        else{
            System.out.println("Invalid Age");
        }
        sc.close();
    }
}