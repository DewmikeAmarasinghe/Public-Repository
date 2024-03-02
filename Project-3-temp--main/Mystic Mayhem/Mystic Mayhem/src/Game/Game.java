package Game;

import Characters.Archers.Ranger;
import Characters.Healers.Medic;
import Characters.Knights.Squire;
import Characters.Mages.Warlock;
import Characters.MythicalCreatures.Dragon;
import HomeGrounds.HomeGround;
import HomeGrounds.Marshland;
import Player.Player;
import Game.Combat;
// import User.User;

public class Game {

    public static void main(String[] args) {
        //Create Players

        // Created by me
        Player me = new Player("myName", "myUserName");
        

        // Created by others
        Player player1 = new Player("GeraltofRivia", "whitewolf");
        player1.setHomeGround("Marshland");
        player1.setGoldCoins(250);
        player1.setXP(32);
        player1.addToArmy("Archer", new Ranger(null, 0, 0, 0, 0, 0));
        player1.addToArmy("Knight", new Squire(null, 0, 0, 0, 0, 0));
        player1.addToArmy("Mage", new Warlock(null, 0, 0, 0, 0, 0));
        player1.addToArmy("Healer",new Medic(null, 0, 0, 0, 0, 0));
        player1.addToArmy("MythicalCreature", new Dragon(null, 0, 0, 0, 0, 0));

        Player player2 = new Player("alex", "alex21");
        Player player3 = new Player("william", "william309");
        Player player4 = new Player("evan", "evan267");
        
        // Me looking for opponents.Statistics are displayed 
        me.searchForOpponents();
        // Accept challenge / skip to the next player
        me.acceptChallenge();
        me.skipToNextPlayer();
        //Assuming the challenge was accepted
        Combat combat = new Combat(player1, player2);
        
        combat.startCombat();
        if(combat.getResult() == 1){
            System.out.println(player1.getName()+" won");
        }else if(combat.getResult() == 2){
            System.out.println(player2.getName()+" won");
        }else{
            System.out.println("Draw"); 
        }
        

        

    }
}
