import java.util.Scanner;
public class PencilCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the standard:");
        byte std = sc.nextByte();
        if(std >= 1 && std <= 12){
            int pencil_count = 0;
            for(int i = 1; i <= std; i++){
                pencil_count = pencil_count + (i * i);
            }
            System.out.println("Nila gets " + pencil_count + " pencils");
        }
        else{
            System.out.println("Invalid Standard");
        }
        sc.close();
    }
}