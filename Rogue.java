public class Rogue extends Hero {

    public Rogue(String nameHero) {
        super(100, 
                100, 
                5, 
                new int[]{20,30},
                nameHero);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Разбойник: " + nameHero + " здоровье: " + health + "/" +healthMax+" броня: " + armor);
    }
    
}
