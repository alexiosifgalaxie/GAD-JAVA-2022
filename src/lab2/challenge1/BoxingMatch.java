package lab2.challenge1;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;
    public BoxingMatch(Fighter fighter1, Fighter fighter2){
    }

    public String fight(Fighter fighter1,Fighter fighter2) {
        while (true) {
            fighter1.attack(fighter2);
            if (fighter2.health <= 0)
                return fighter1.name;
            fighter2.attack(fighter1);
            if (fighter1.health <= 0)
                return fighter2.name;
        }
    }
}
