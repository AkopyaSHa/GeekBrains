package lesson6;

public class Cat extends Animal {

    private double maxJumpSkill = 2.5;
    private int maxRunSkill = 250;
    private int maxSwimSkill = 0;

    public Cat(String type, String name, int jumpSkill, int runSkill, int swimSkill) {
        super(type, name, jumpSkill, runSkill, swimSkill);
        setType("Кошка");
        getRandomSkill();
    }

    @Override
    public void swim(int length) {
        System.out.println(
                String.format("%s %s не смог проплыть маршрут длинной %s м. \nКошки не умеют плавать", getType(), getName(), length));
        System.out.println("Результат: false");
        System.out.println();
    }

    @Override
    public void getRandomSkill() {
        int strength = (int) (Math.random() * 4);
        setJumpSkill(maxJumpSkill - 0.5 * strength);
        setRunSkill(maxRunSkill - 100);
        setSwimSkill(0);
    }
}
