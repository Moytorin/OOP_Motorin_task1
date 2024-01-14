public class PikeMan extends Hero {
    
    public PikeMan(String nameHero) {
        super(  100, 
                100, 
                5, 
                new int[]{20,30},
                nameHero);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Копейщик: " + nameHero + " здоровье: " + health + "/" +healthMax+" броня: " + armor);
    }

}
