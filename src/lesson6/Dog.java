package lesson6;

public class Dog extends Animal {

    private double maxJumpSkill = 1.5;
    private int maxRunSkill = 600;
    private int maxSwimSkill = 15;


    public Dog(String type, String name, int jumpSkill, int runSkill, int swimSkill) {
        super(type, name, jumpSkill, runSkill, swimSkill);
        setType("Собака");
        getRandomSkill();
    }

    @Override
    public void getRandomSkill() {
        int strength = (int) (Math.random() * 4);
        setJumpSkill(maxJumpSkill - 0.5 * strength);
        setRunSkill(maxRunSkill - 100 * strength);
        setSwimSkill(maxSwimSkill - 5 * strength);
        System.out.println(strength+"!!!!!!!!!!!!!!!!");
    }
}
