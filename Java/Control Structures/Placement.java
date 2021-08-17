import java.util.Scanner;

class Placement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed is CSE:");
        int cse = sc.nextInt();
        System.out.println("Enter the no of students placed is ECE:");
        int ece = sc.nextInt();
        System.out.println("Enter the no of students placed is MECH:");
        int mech = sc.nextInt();

        if (cse < 0 || ece < 0 || mech < 0) {
            System.out.println("Input is invalid");
        } else if (cse == ece && cse == mech && ece == mech) {
            System.out.println("None of the department has got the highest placement");
        } else {
            System.out.println("Highest Placement");
            if (cse >= ece) {
                if (cse > mech) {
                    System.out.println("CSE");
                    if(cse == ece){
                        System.out.println("ECE");
                    }
                } else {
                    if(cse == mech){
                        System.out.println("CSE");
                    }
                    System.out.println("MECH");
                   
                }
            } else {
                if (ece >= mech) {
                    System.out.println("ECE");
                    if(ece == mech){
                        System.out.println("MECH");
                    }
                } else {
                    System.out.println("MECH");
                }
            }
        }
        sc.close();
    }
}