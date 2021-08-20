import java.util.Scanner;

public class StudentMain {

    public static Student getStudentDeatils(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student's Name:");
        String studentName = sc.nextLine();

        System.out.println("Enter Student's address:");
        String studentAddress = sc.nextLine();
        String str = "";
        Student sObj = null;
        while(true){
            System.out.println("Whether the student is from NIT(Yes/No):");
            str = sc.next();
            sc.nextLine();
            if(str.equalsIgnoreCase("yes")){
               sObj = new Student(studentId, studentName, studentAddress);
               break;
            }
            else if(str.equalsIgnoreCase("no")){
                System.out.println("Enter the college name:");
                String collegeName = sc.nextLine();
                sObj = new Student(studentId, studentName, studentAddress, collegeName);
                break;
            }
            System.out.println("Wrong Input");
        }
        sc.close();
        return sObj;
    }
    public static void main(String[] args) {
       Student s = getStudentDeatils();
       if(s != null){
           System.out.println("Stduent id:" + s.getStudentId());
           System.out.println("Stduent name:" + s.getStudentName());
           System.out.println("Address:" + s.getStudentAddress());
           System.out.println("College name:" + s.getCollegeName());
       }
    }    
}
