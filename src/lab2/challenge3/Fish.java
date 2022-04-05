package lab2.challenge3;

public class Fish extends Animal implements Pet {
    String name;
    public Fish(String name){
        super(0);
        this.name=name;
    }

    public Fish(){this("");}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play(){System.out.println(name+" is playing");}

    @Override
    public void eat(){System.out.println(name+" is eating");}

    @Override
    public void walk(){System.out.println("FIsh don't walk");}
}

