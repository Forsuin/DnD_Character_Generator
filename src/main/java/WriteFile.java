import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        Player player = new Player();
        player.setCharName("Jeff the Barbarian");
        player.setpClass(Player.pClass.BARBARIAN);
        player.setAlignment(Player.pAlignment.CHAOTICGOOD);
        player.setBackground(Player.Background.SOLDIER);
        player.setRace(Player.Race.HUMAN);
        player.setPlayerName("Banno");
        player.setXp(10000);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(player);

        try{
            FileWriter file = new FileWriter("DnD Character");
            file.write(json);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(json);
    }
}