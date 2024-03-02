package HomeGrounds;
import Characters.Character;
public class Marshland extends HomeGround{

    public Marshland(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void applyHomeGroundEffect(Character character) {
        switch (character.getCategory()) {
            case "Highlanders":
               
                break;
            
            case "Marshlanders":
                character.setDefenseValue(character.getDefenseValue() + 2);
                break;
            
            case "Sunchildren":
                character.setAttackValue(character.getAttackValue() - 1);
                break;
            
            case "Mystics":
                character.setSpeedValue(character.getSpeedValue() - 1);
                break;    
            default:
                break;
        }
    }
    
}
