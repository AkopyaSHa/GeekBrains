package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;//сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = true;
    }

    void info() {
        System.out.println(name + " имеет аппетит " + appetite);
        String isHungry = !fullness ? " сыт/сыта" : " остается голодным/голодной,т.к. в тарелке мало еды.";
        System.out.println(name + isHungry);
    }

    public void eat(Plate p) {
        if (fullness == true && p.decreaseFood(appetite) == true) {
            fullness = false;
        }
        System.out.println(" ");
    }
}
