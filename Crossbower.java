public class Crossbower extends Hero{
    
    

    public Crossbower(String nameHero, int posX, int posY) {
        super(75, 75, 2, new int[]{10,15}, nameHero, posX, posY);
        rangeMaxDamage = 4;
        
    }
    protected Vector2 position;

    protected int rangeMaxDamage;
    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("Арбалетчик: " + nameHero + " здоровье: " + health + "/" + healthMax +" броня: " + armor);
    }

}
