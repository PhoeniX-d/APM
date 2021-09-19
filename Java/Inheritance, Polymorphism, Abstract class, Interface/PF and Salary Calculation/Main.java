import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the salary:");
        float salary = sc.nextFloat();
        System.out.println("Enter the pfpercentage:");
        float pfpercentage = sc.nextFloat();
        boolean d1 = true;
        PermanentEmployee pe = new PermanentEmployee();
        pe.setName(name);
        pe.setSalary(salary);
        pe.setPfpercentage(pfpercentage);
        d1 = pe.validateInput();
        if (d1 == false) {
            System.out.println("Error!!! Unable to calculate the NetSalary");
        } else {
            pe.findNetSalary();
            System.out.println("Employee Name:" + pe.getName());
            System.out.println("PF Amount:" + String.format("%.2f", pe.getPfamount()));
            System.out.println("Netsalary:" + String.format("%.2f", pe.getNetsalary()));
        }
    }
}
