package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Буся");
        cat.jump(2);
        cat.swim(100);
        cat.run(200);
        Dog dog = new Dog("Моника");
        dog.swim(10);
        dog.jump(1);
        dog.run(500);
    }
}
