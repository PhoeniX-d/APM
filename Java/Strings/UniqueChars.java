import java.util.*;
public class UniqueChars {
    private static final int MAX_CHARS = 127;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();
        if(sentence.matches("^[a-zA-Z\\s]*$")){
            int[] characters = new int[MAX_CHARS];
            int sentenceLength = sentence.length();
            for(int i = 0; i < sentenceLength; i++)
                characters[sentence.charAt(i)]++;
            boolean flag = false;
            for(int i = 0 ; i < sentenceLength; i++){
                if(characters[sentence.charAt(i)] == 1)
                    flag = true;
            }
            if(flag == false)
                System.out.println("No unique characters");
            else{
                System.out.println("Unique characters:");
                for(int i = 0; i < sentenceLength; i++){
                    if(characters[sentence.charAt(i)] == 1)
                        System.out.println(sentence.charAt(i));
                }
            }
        }
        else
            System.out.println("Invalid Sentence");;
        sc.close();
    }
}
