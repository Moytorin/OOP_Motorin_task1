import java.util.ArrayList;

public abstract class Hero {

    
    public static final char[] toString = null;

    public int health, armor, healthMax;


    protected int[] damage;
    protected String nameHero;
    protected Vector2 position;
    public Hero(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY) {

        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(posX, posY);

    }

    public void printEnemyDistance(ArrayList<Hero> enemys){
    
       enemys.forEach(n-> System.out.print(position.rangeEnemy(n.position) + ", "));
       System.out.println();
    }

}
