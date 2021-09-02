public class PlayerUtility {
    public Player findPlayerDerailsById(Player[] arr, int playerIdToSearch){
        Player player = null;
        for(int i = 0; i < arr.length; i++){
            if(playerIdToSearch == arr[i].getPlayerId()){
                String playerName = arr[i].getPlayerName();
                int age = arr[i].getAge();
                long phoneNumber = arr[i].getPhoneNumber();
                player = new Player(playerIdToSearch, playerName, age, phoneNumber);
            }
        }
        return player;
    }
}
