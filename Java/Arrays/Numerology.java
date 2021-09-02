import java.util.Scanner;
public class Numerology{

    private static final char[][] numerology = {{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'},
                               {1, 2, 3, 4, 5, 8, 3, 5, 1, 1, 2, 3, 4, 5, 7, 8, 1, 2, 3, 4, 6, 6, 6, 5, 1, 7}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        int strLength =  name.length();
        int value = 0, i = 0;
        for(i = 0; i < strLength; i++){
            char ch = name.charAt(i);
            int numerologicalNumber = getNumerologicalNumber(ch);
            if(numerologicalNumber == -1){
                System.out.println("Invalid name");
                break;
            }
            else{
                value = value + numerologicalNumber;
            }
        }
        if(i == strLength)
            System.out.println("Your numerology no is:" + value);
        sc.close();
    }

    public static int getNumerologicalNumber(char character){
        int number = -1;
        for(int i = 0; i < numerology[0].length; i++)
        {
            if(character == numerology[0][i]){
                number = numerology[1][i];
            }
        }
        return number;
    }
}