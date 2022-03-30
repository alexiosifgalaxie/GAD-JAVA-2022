package lab2.challenge1;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;
    public BoxingMatch(Fighter fighter1, Fighter fighter2){
        this.fighter1=fighter1;
        this.fighter2=fighter2;
    }

    public String fight() {
        while (true) {
            fighter1.attack(fighter2);
            if (fighter2.getHealth() <= 0) {
                System.out.print(fighter1.getName());
                return fighter1.getName();
            }
            fighter2.attack(fighter1);
            if (fighter1.getHealth() <= 0) {
                System.out.print(fighter2.getName());
                return fighter2.getName();
            }
        }
    }
}
