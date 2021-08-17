import java.util.Scanner;
public class Registration{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        System.out.print("Enter your phoneno:");
        long phoneno = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter your qualification:");
        String qualification = sc.nextLine();
        System.out.print("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
        String emailid = sc.nextLine();
        System.out.print("Enter your noofexperience[if any]:");
        float exp = sc.nextFloat();

        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneno);
        System.out.println(qualification);
        System.out.println(emailid);
        System.out.println(exp);
        

    }
}