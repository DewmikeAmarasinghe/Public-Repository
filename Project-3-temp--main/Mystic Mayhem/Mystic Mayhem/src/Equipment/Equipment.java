package Equipment;

import Equipment.Armours.Armour;
import Equipment.Artefacts.Artefact;
import Characters.Character;

public class Equipment {
    private String name;
    private int price;
    private double attack;
    private double defense;
    private double health;
    private double speed;

    public Equipment(String name, int price, double attack, double defense, double health, double speed) {
        this.name = name;
        this.price = price;
        this.attack =attack;
        this.defense = defense;
        this.health = health;
        this.speed = speed;
    }
    
    public void purchaseEquipment(Character character,Equipment new_equipment) {
        double valueDecrease = 0;
  
        if (new_equipment instanceof Artefact && character.getArtefact() != null) {
            valueDecrease = 0.2 * character.getArtefact().getPrice();
        } 
        else if (new_equipment instanceof Armour && character.getArmour() != null) {
            valueDecrease = 0.2 * character.getArmour().getPrice();
        }
        double valueIncrease = 0.2 * new_equipment.getPrice();
        character.setPrice(character.getPrice() + (int) Math.round(valueIncrease - valueDecrease));
    }

    public void changeEquipment(Character character,Equipment new_equipment) {

        if (new_equipment instanceof Artefact && character.getArtefact() != null) {
            character.setArtefact(new_equipment);
        } 
        else if (new_equipment instanceof Armour && character.getArmour() != null) {
            character.setArmour(new_equipment);
        }
    }

    // Getter and Setter 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }    


}
