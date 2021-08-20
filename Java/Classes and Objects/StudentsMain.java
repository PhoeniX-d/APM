import java.util.Scanner;
public class StudentsMain {
    public static Students getStudentsDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id:");
        int id = sc.nextInt();

        System.out.println("Enter the name:");
        String name = sc.next();
        int subjects = 0;
        do{
            System.out.println("Enter the no of subjects:");
            subjects = sc.nextInt();
            if(subjects <= 0)
                System.out.println("Invalid number of subjects");
        }while(subjects <= 0);

        int[] marks = new int[subjects];
        for(int i = 0; i < subjects; i++){
            do{
                System.out.println("Enter mark for subject " + (i + 1));
                marks[i] = sc.nextInt();
                if(marks[i] < 0 || marks[i] > 100)
                    System.out.println("Invalid Mark");
            }while(marks[i] < 0 || marks[i] > 100);
        }

        Students students = new Students(id, name, marks);
        sc.close();
        return students;
    }

    public static void main(String[] args) {
        Students s = getStudentsDetails();
        s.calculateAvg();
        s.findGrade();
        System.out.println("Id:" + s.getId());
        System.out.println("Name:" + s.getName());
        System.out.println("Average:" + s.getAverage());
        System.out.println("Grade:" + s.getGrade());
    }
}
