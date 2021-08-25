import java.util.Scanner;
public class CourseSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of course:");
        int no_of_course = sc.nextInt();
        if(no_of_course <= 0){
            System.out.println("Invalid Range");
        }
        else{
            System.out.println("Enter course names:");
            String[] courses = new String[no_of_course];
            for(int i = 0; i < courses.length; i++){
                courses[i] = sc.next();
            }
            System.out.println("Enter the course to be searched");
            String s_course = sc.next();
            int i = 0, j = 0;
            for(i = 0, j = courses.length - 1; i <= j; i++, j--){
                if(courses[i].equals(s_course) || courses[j].equals(s_course))
                    break;
            }
            if(i > j)
                System.out.println(s_course + " course is not available");
            else
                System.out.println(s_course + " course is available");
        }
        
        sc.close();
    }
}
