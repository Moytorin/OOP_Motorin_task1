public abstract class Hero {

    
    public static final char[] toString = null;

    public int health, armor, healthMax;

    int[] damage;

    String nameHero;

    public Hero(int health, int healthMax, int armor, int[] damage, String nameHero) {

        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;

    }

    @Override
    public String toString(){
        return super.toString();
    }
}
