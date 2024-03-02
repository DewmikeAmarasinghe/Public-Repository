package HomeGrounds;

import Characters.Character;

public class Desert extends HomeGround{

    public Desert(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void applyHomeGroundEffect(Character character) {
        switch (character.getCategory()) {
            case "Highlanders":
                break;
            
            case "Marshlanders":
                character.setHealthValue(character.getSpeedValue() - 1);
                break;
            
            case "Sunchildren":
                character.setAttackValue(character.getAttackValue() + 1);
                break;
            
            case "Mystics":
                break;    
            default:
                break;
           }
    }
    
}
