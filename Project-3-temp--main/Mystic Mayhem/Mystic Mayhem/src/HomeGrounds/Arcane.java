package HomeGrounds;
import Characters.Character;
public class Arcane extends HomeGround{

    public Arcane(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void applyHomeGroundEffect(Character character) {
        switch (character.getCategory()) {
            case "Highlanders":
                character.setDefenseValue(character.getDefenseValue() - 1);   
                character.setSpeedValue(character.getDefenseValue() - 1);
                break;
            
            case "Marshlanders":
                character.setDefenseValue(character.getDefenseValue() - 1);
                character.setSpeedValue(character.getDefenseValue() - 1);
                break;
            
            case "Sunchildren":
                
                break;
            
            case "Mystics":
                character.setAttackValue(character.getAttackValue() + 2);
                break;    
            default:
                break;
        }
    }

  
    
}
