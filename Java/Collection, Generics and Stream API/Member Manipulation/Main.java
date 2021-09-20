import java.util.*;

public class Main {
    public static void main(String args[]) {
        Library lobj = new Library();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i != 4) {
            System.out.println("1.Add Member\n2.View All Members\n3.Search Member by address\n4.Exit");
            System.out.println("Enter your choice");
            int n = sc.nextInt();
            if (n == 1) {
                Member obj = new Member();
                System.out.println("Enter the id:");
                obj.setMemberId(sc.nextInt());
                System.out.println("Enter the name:");
                obj.setMemberName(sc.nextLine());
                System.out.println("Enter the address:");
                obj.setAddress(sc.nextLine());
                lobj.addMember(obj);
            }
            if (n == 2) {
                if(lobj.isEmpty())
                    System.out.println("The list is empty");
                else {
                    List<Member> obj1 = o.viewAllMembers();
                    for (Member o1 : obj1) {
                        System.out.println("Id:" + o1.getMemberId());
                        System.out.println("Name:" + o1.getMemberName());
                        System.out.println("Address:" + o1.getAddress());
                    }
                }
            }
            if (n == 3) {
                if(lobj.isEmpty())
                    System.out.println("The list is empty");
                else {
                    System.out.println("Emter the address:");
                    List<Member> obj = o.viewMembersByAddress(sc.nextLine());
                    for (Member obj1 : obj) {
                        System.out.println("Id:" + obj1.getMemberId());
                        System.out.println("Name:" + obj1.getMemberName());
                        System.out.println("Address:" + obj1.getAddress());
                    }
                }
            }
        }
    }
}