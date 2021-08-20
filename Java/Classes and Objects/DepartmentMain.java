import java.util.Scanner;

public class DepartmentMain{
    
    public static DeptStudent createStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Department id:");
        int did = sc.nextInt();

        System.out.println("Enter the Department name:");
        String dname = sc.next();

        System.out.println("Enter the Student id:");
        int sid = sc.nextInt();

        System.out.println("Enter the Student name;");
        String sname = sc.next();

        Department dept = new Department();
        dept.setDid(did);;
        dept.setDname(dname);

        DeptStudent ds = new DeptStudent();
        ds.setSid(sid);
        ds.setSname(sname);
        ds.setDepartment(dept);

        sc.close();
        return ds;
    }

    public static void main(String[] args) {
        DeptStudent ds = createStudent();
        System.out.println("Department id:" + ds.getDepartment().getDid());
        System.out.println("Department name:" + ds.getDepartment().getDname());
        System.out.println("Student id:" + ds.getSid());
        System.out.println("Student name:" + ds.getSname());
    }
}