import java.util.HashMap;
import java.util.Map;

import Characters.Character;

public class User {
    private static int userIDCount = 1;
    
    private String name;
    private String username;
    private int userID;
    private int XP;
    private int goldCoins;
    private String homeGround;
    private Map<String, Character> army;

    public User(String name, String username) {
        this.userID = userIDCount++;
        this.name = name;
        this.username = username;
        this.XP = 0;
        this.goldCoins = 500;
        this.homeGround = null;  // Default home ground is set to null
        this.army = new HashMap<>();
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }

    public int getXP() {
        return XP;
    }

    public int getGoldCoins() {
        return goldCoins;
    }

    public String getHomeGround() {
        return homeGround;
    }

    public Map<String, Character> getArmy() {
        return army;
    }

    
    public void setHomeGround(String homeGround) {
        this.homeGround = homeGround;
    }

    // regular methods 

    // Methods related to Gold Coins
    public void increaseGoldCoins(int amount) {
        goldCoins += amount;
    }

    public void decreaseGoldCoins(int amount) {
        if (amount <= goldCoins) {
            goldCoins -= amount;
        } else {
            System.out.println("Insufficient gold coins!");
        }
    }

    // Methods related to Army
    public void addToArmy(String category, Character character) {
        if (!army.containsKey(category)) {
            army.put(category, character);
        }
    }

    public void removeFromArmy(String category) {
        army.remove(category);
    }

    //Methods related to Gameplay 

    public void searchForOpponents(){
        System.out.println("searching opponents");
    };
    
    public void acceptChallenge(){
        System.out.println("Challenge accepted");
    }

    public void declineChallenge(){
        System.out.println("Challenge declined");
    }

    public void selectHomeGround(){
        System.out.println("Home ground has been selected");
    }

    // Other methods for battling, buying characters, equipment, etc.

    @Override
    public String toString() {
        return "Player{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", XP=" + XP +
                ", goldCoins=" + goldCoins +
                ", homeGround='" + homeGround + '\'' +
                ", army=" + army +
                '}';
    }
}
