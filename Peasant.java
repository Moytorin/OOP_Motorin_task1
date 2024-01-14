/**
 * Peasant
 */
public class Peasant extends Hero {

    public Peasant(String nameHero) {
        super(  100, 
                100, 
                0, 
                new int[]{0,0},
                nameHero);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Крестьянин: " + nameHero + " здоровье: " + health + "/" +healthMax+" броня: " + armor);
    }

}
