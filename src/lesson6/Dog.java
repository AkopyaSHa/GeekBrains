package lesson6;

public class Dog extends Animal {

    private double maxJumpSkill = 1.5;
    private int maxRunSkill = 600;
    private int maxSwimSkill = 15;


    public Dog(String name) {
        super(name);
        setType("Собака");
        getRandomStrength();
    }

    @Override
    public void getRandomStrength() {
        int strength = (int) (Math.random() * 4);
        setJumpSkill(maxJumpSkill - 0.5 * strength);
        setRunSkill(maxRunSkill - 100 * strength);
        setSwimSkill(maxSwimSkill - 5 * strength);
    }
}
