package HomeGrounds;
import Characters.Character;

public class Hilcrest extends HomeGround{

    public Hilcrest(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void applyHomeGroundEffect(Character character) {
       
       switch (character.getCategory()) {
        case "Highlanders":
            character.setAttackValue(character.getAttackValue() + 1);
            character.setDefenseValue(character.getDefenseValue() + 1);
            break;
        
        case "Marshlanders":
            character.setSpeedValue(character.getSpeedValue() - 1);
            break;
        
        case "Sunchildren":
            character.setSpeedValue(character.getSpeedValue() - 1);
            break;
        
        case "Mystics":
            
            break;    
        default:
            break;
       }
    }

    
    
}
