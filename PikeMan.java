public class PikeMan extends Hero {
    
    

    public PikeMan(String nameHero, int posX, int posY) {
        super(100, 100, 5, new int[]{20,30}, nameHero, posX, posY);
        
    }
    protected Vector2 position;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Копейщик: " + nameHero + " здоровье: " + health + "/" +healthMax+" броня: " + armor);
    }

}
