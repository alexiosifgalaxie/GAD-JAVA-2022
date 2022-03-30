package lab2.challenge1;

public class Fighter {
    String name;
    public int health;
    int damagePerAttack;
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public Fighter(String name, int health, int damagePerAttack){
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }
    public void attack(Fighter opponent){
        opponent.setHealth(opponent.getHealth()-damagePerAttack);
    }
}
