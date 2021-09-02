import java.util.*;

public class FindAndReplace2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to be searched:");
        String wordToBeSearched = sc.nextLine();
        System.out.println("Enter the word to be replaced:");
        String wordToBeReplaced = sc.nextLine();
        if (sentence.contains(wordToBeSearched)) {
            sentence = sentence.replace(wordToBeSearched, wordToBeReplaced);
            System.out.println(sentence);
        } else {
            System.out.println("The word " + wordToBeSearched + " not found");
        }
        sc.close();
    }
}