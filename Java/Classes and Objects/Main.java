import java.util.Scanner;

public class Main {

    public static Employee getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter salary");
        double salary = sc.nextDouble();

        Employee emp = new Employee();
        emp.setEmployeeId(id);
        emp.setEmployeeName(name);
        emp.setSalary(salary);

        return emp;
    }

    public static int getPFPercentage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PF percentage:");
        int pf = sc.nextInt();
        sc.close();
        return pf;
    }

    public static void main(String[] args) {
        Employee empObj = getEmployeeDetails();
        int pf = getPFPercentage();
        empObj.calculateNetSalary(pf);
        System.out.println("Id : " + empObj.getEmployeeId());
        System.out.println("Name : " + empObj.getEmployeeName());
        System.out.println("Salary : " + empObj.getSalary());
        System.out.println("Net Salary : " + empObj.getNetSalary());
    }

}
