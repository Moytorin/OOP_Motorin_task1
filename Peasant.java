/**
 * Peasant
 */
public class Peasant extends Hero {

    public Peasant(String nameHero, int posX, int posY) {
        super(100, 100, 0, new int[]{0,0}, nameHero, posX, posY);
        
        
    }
    protected Vector2 position;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Крестьянин: " + nameHero + " здоровье: " + health + "/" +healthMax+" броня: " + armor);
    }

}
