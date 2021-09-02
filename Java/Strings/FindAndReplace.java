import java.util.*;
public class FindAndReplace{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = sc.nextLine();
        System.out.println("Enter the character to be searched:");
        char charToBeSearched = sc.next().charAt(0);

        System.out.println("Enter the character to be replaced:");
        char charToBeReplaced = sc.next().charAt(0);
        
        int index = string.indexOf(charToBeSearched);
        if(index != -1)
            System.out.println(string.replaceFirst("["+charToBeSearched+"]", charToBeReplaced + ""));        else 
            System.out.println("character not found");
        sc.close();
    }
}
