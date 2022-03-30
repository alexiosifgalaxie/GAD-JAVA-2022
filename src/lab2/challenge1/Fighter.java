package lab2.challenge1;

public class Fighter {
    String name;
    public int health;
    int damagePerAttack;
    public void attack(Fighter opponent){
        opponent.health=opponent.health-this.damagePerAttack;
    }
}
