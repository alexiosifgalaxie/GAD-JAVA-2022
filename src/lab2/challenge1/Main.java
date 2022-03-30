package lab2.challenge1;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1= new Fighter("boss",100,2);
        Fighter fighter2= new Fighter("bosss",80,2);
        BoxingMatch boxingMatch=new BoxingMatch(fighter1,fighter2);
        boxingMatch.fight();
    }
}
