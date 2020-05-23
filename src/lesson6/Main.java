package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кошка", "Буся", 0, 0, 0);
        cat.jump(2);
        cat.swim(100);
        cat.run(200);
        Dog dog = new Dog("Собака", "Моника", 0, 0, 0);
        dog.swim(10);
        dog.jump(1);
        dog.run(500);
    }
}
