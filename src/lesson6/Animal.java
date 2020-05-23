package lesson6;

public class Animal {
    private String type;
    private String name;
    private double jumpSkill;
    private int runSkill;
    private int swimSkill;

    public Animal(String type, String name, double jumpSkill, int runSkill, int swimSkill) {
        this.type = type;
        this.name = name;
        this.jumpSkill = jumpSkill;
        this.runSkill = runSkill;
        this.swimSkill = swimSkill;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getJumpSkill() {
        return jumpSkill;
    }

    public void setJumpSkill(double jumpSkill) {
        this.jumpSkill = jumpSkill;
    }

    public int getRunSkill() {
        return runSkill;
    }

    public void setRunSkill(int runSkill) {
        this.runSkill = runSkill;
    }

    public int getSwimSkill() {
        return swimSkill;
    }

    public void setSwimSkill(int swimSkill) {
        this.swimSkill = swimSkill;
    }


    public void getRandomStrength() { //метод для последующей реализации разброса способностей животных
        System.out.println("Метод требует перегрузки для конкретного класса");
    }

    public void jump(int height) {
        if (height <= jumpSkill) {
            System.out.println(String.format("%s %s перепрыгивает препядствие высотой %s м.", getType(), getName(), height));
            System.out.println("Результат: true");
        } else {
            System.out.println(String.format("%s %s не смог перепрыгнуть препядствие высотой %s м.", getType(), getName(), height));
            System.out.println("Результат: false");
        }
        System.out.println();
    }

    public void run(int length) {
        if (length <= runSkill) {
            System.out.println(String.format("%s %s пробегает маршрут длинной %s м.", getType(), getName(), length));
            System.out.println("Результат: true");
        } else {
            System.out.println(String.format("%s %s не смог пробежать маршрут длинной %s м.", getType(), getName(), length));
            System.out.println("Результат: false");
        }
        System.out.println();
    }

    public void swim(int length) {
        if (length <= swimSkill) {
            System.out.println(String.format("%s %s проплывает маршрут длинной %s м.", getType(), getName(), length));
            System.out.println("Результат: true");
        } else {
            System.out.println(String.format("%s %s не смог проплыть маршрут длинной %s м.", getType(), getName(), length));
            System.out.println("Результат: false");
        }
        System.out.println();
    }
}
