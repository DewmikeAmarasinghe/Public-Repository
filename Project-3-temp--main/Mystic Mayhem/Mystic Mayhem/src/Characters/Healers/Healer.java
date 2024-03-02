package Characters.Healers;

import Characters.Character;

public class Healer extends Character {

    // ... (existing code)

    public Healer(String name, int price, double attack, double defense, double health, double speed, String category) {
        super(name, price, attack, defense, health, speed, category);
    }

    // Healer-specific method to perform healing
    public void heal(Character target) {
        double healingAmount = 0.1 * this.getAttackValue();
        double newHealthValue = target.getHealthValue() + healingAmount;
        target.setHealthValue(newHealthValue);
        System.out.println(this.getName() + " is healing " + target.getName() + " for " + healingAmount + " health.");
    }

    @Override
    public void attack(Character target) {
        // Find the alive character with the lowest health in the army
        Character lowestHealthCharacter = findAliveLowestHealthCharacter();
    
        // Perform healing on the character with the lowest health
        if (lowestHealthCharacter != null) {
            heal(lowestHealthCharacter);
        } else {
            // If no alive character is found, stop attacking
            System.out.println(this.getName() + " has no one to heal. Stopping attack.");
        }
    }
    

    // New method to find the alive character with the lowest health in the army
    public Character findAliveLowestHealthCharacter() {
        Character lowestHealthCharacter = null;
        double lowestHealth = Double.MAX_VALUE;

        // Iterate through the army to find the alive character with the lowest health
        for (Character character : getArmy().values()) {
            if (character.getAlive() && character.getHealthValue() < lowestHealth) {
                lowestHealth = character.getHealthValue();
                lowestHealthCharacter = character;
            }
        }

        return lowestHealthCharacter;
    }
}
