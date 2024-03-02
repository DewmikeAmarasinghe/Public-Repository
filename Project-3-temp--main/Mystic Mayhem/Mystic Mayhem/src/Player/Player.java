package Player;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Characters.Character;


public class Player {
    private static int userIDCount = 1;
    
    private String name;
    private String username;
    private int userID;
    private int XP;
    private int goldCoins;
    private String homeGround;
    private Map<String, Character> army;

    // Collection to store existing usernames
    private static Set<String> existingUsernames = new HashSet<>();

    public Player(String name, String username) {
        this.userID = userIDCount++;
        this.name = name;

        // Check if the username is available before assigning it
        if (checkAvailabilityOfUsername(username)) {
            this.username = username;
            existingUsernames.add(username);
        } else {
            throw new IllegalArgumentException("Username is already taken. Please choose a different username.");
        }

       
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

    public void setXP(int XP){
        this.XP = XP;
    }

    public int getGoldCoins() {
        return goldCoins;
    }

    public void setGoldCoins(int goldCoins){
        this.goldCoins = goldCoins;
    }
    
    public Map<String, Character> getArmy() {
        return army;
    }

    
    public void setHomeGround(String homeGround) {
        this.homeGround = homeGround;
    }

    public String getHomeGround() {
        return homeGround;
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

    //Methods related to Login
    public void login(){
        //todo
    }

    
    public static boolean checkAvailabilityOfUsername(String newUsername) {
        return !existingUsernames.contains(newUsername);
    }
    //Methods related to Gameplay 

    public void searchForOpponents(){
        System.out.println("searching opponents");
        System.out.println("display name & XP of other players.One at a time");
    };
    
    public void acceptChallenge(){
        System.out.println("Challenge accepted");
    }

    public void skipToNextPlayer(){
        System.out.println("skipping to the next palyer");
    }

    public void selectHomeGround(){
        System.out.println("Home ground has been selected");
    }

     

    // Other methods for battling, buying characters, equipment, etc.
    // Method to purchase a new character
    public void purchasingCharacters(String category, Character newCharacter) {
        int cost = newCharacter.getPrice();

        if (goldCoins >= cost) {
            decreaseGoldCoins(cost);
            
            if (army.containsKey(category)) {
                // If the category already has a character, sell it first
                Character existingCharacter = army.get(category);
                sellingCharacters(existingCharacter, category);
            }
            System.out.println("Character bought successfully!");
            addToArmy(category, newCharacter);

        } else {
            System.out.println("Insufficient gold coins to purchase the character!");
        }
    }

    // Method to sell an existing character
    public void sellingCharacters(Character character, String category) {
        if (army.containsKey(category) && army.get(category) == character) {
            army.remove(category);

            // Calculate the sell price (90% of the original price)
            double sellPrice = 0.9 * character.getPrice();
            int sellPriceInt = (int) sellPrice;

            increaseGoldCoins(sellPriceInt);
            System.out.println("Character sold successfully!");
        } else {
            System.out.println("No character found in the specified category to sell!");
        }
    }


}
