import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Player[] pObj = new Player[4];
        pObj[0] = new Player(146, "Atul", 16, 9856894785L);
        pObj[1] = new Player(135, "Rakshana", 16, 9856894785L);
        pObj[2] = new Player(168, "Christy", 16, 9856894785L);
        pObj[3] = new Player(194, "Atulya", 16, 9856894785L);
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the id to be searched");
        int id = sc.nextInt();
        PlayerUtility pu = new PlayerUtility();
        Player player = pu.findPlayerDerailsById(pObj, id);
        if(player != null){
            System.out.println("Name:" + player.getPlayerName());
            System.out.println("Phone Number:" + player.getPhoneNumber());
        }
        else
            System.out.println("No player found");
        sc.close();
    }
}
