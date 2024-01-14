public class Sniper extends Hero {
    public Sniper(String nameHero) {
        super(  50, 
                50, 
                1, 
                new int[]{-35,-30},
                nameHero);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Монах: " + nameHero + " здоровье: " + health + "/" +healthMax+" броня: " + armor);
    }
}
