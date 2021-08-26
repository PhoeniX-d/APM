import java.util.Scanner;
public class HighestMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of semester:");
        int semester = sc.nextInt();
        if(semester <= 0){
            sc.close();
            return;
        }
        int[][] marks = new int[semester][];
        for(int i = 0; i < marks.length; i++){
            System.out.println("Enter no of subjects in " + (i + 1) + " semester:");
            int subjects = sc.nextInt();
            if(subjects > 0)
                marks[i] = new int[subjects];
            else{
                sc.close();
                return;
            }
        }
        int i = 0, j = 0;
        int maxMarks[] = new int[semester];
        for(i = 0; i < marks.length; i++){
            System.out.println("Marks obtained in semester " + (i + 1) + ":");
            for(j = 0; j < marks[i].length; j++){
                marks[i][j] = sc.nextInt();
                if(marks[i][j] <= 0 || marks[i][j] >= 100){
                    System.out.println("You have entered invalid mark.");
                    break;
                }
            }
            if(j != marks[i].length)
                break;
            else
                maxMarks[i] = getMaxMarks(marks[i]);
        }
        if(i != marks.length){
            sc.close();
            return;
        }
        for(i = 0; i < maxMarks.length; i++){
            System.out.println("Maximum mark in " + (i + 1) + " semester:" + maxMarks[i]);
        }
        sc.close();
    }

    public static int getMaxMarks(int[] marks){
        int max = marks[0];
        for(int i = 0; i < marks.length; i++){
            if(max < marks[i])
                max = marks[i];
        }
        return max;
    }
}
