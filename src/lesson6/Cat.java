package lesson6;

public class Cat extends Animal {
//устанавливаю ограничения для вида по способностям
    private double maxJumpSkill = 2.5;
    private int maxRunSkill = 250;
    private int maxSwimSkill = 0;

    public Cat(String name) { //конструктор при создание кошки, присваивает ей тип и случайную силу, от которой зависят скиллы
        super(name);
        setType("Кошка");
        getRandomStrength();
    }

    @Override
    public void swim(int length) { //уникальный метод
        System.out.println(
                String.format("%s %s не смог проплыть маршрут длинной %s м. \nКошки не умеют плавать", getType(), getName(), length));
        System.out.println("Результат: false");
        System.out.println();
    }

    @Override
    public void getRandomStrength() { //реализация разброса в ограничениях. Каждое новое существо будет иметь случайную силу
        int strength = (int) (Math.random() * 4);
        setJumpSkill(maxJumpSkill - 0.5 * strength);
        setRunSkill(maxRunSkill - 50 * strength);
        setSwimSkill(0);
    }
}
