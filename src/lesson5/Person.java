package lesson5;

class Person {
    private String fio;
    private String post;
    private String email;
    private String tel;
    private double salary;
    private int age;

    Person(String fio, String post, String email, String tel, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Сотрудник должен быть старше 18 лет");
        }
    }

    int GetAge() {
        return age;
    }

    void Show() {
        System.out.println(fio + " " + post + " " +  email + " " + tel + " " + salary + " " + age);
    }

    public static void main(String[] args) {

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Сергей Ройко", "Engineer", "raz@mail.ru", "892312312", 30000, 30);
        persArray[1] = new Person("Михаил Шульман", "Engineer1", "dva@mail.ru", "1892312312", 40000, 40);
        persArray[2] = new Person("Аникеев Георгий", "Engineer2", "tri@mail.ru", "2892312312", 50000, 50);
        persArray[3] = new Person("Акопян Рубен", "Engineer3", "chetare@mail.ru", "3892312312", 60000, 60);
        persArray[4] = new Person("Майкл Гейтс", "Engineer4", "pati@nail.ru", "4892312312", 70000, 70);

        for(Person item : persArray) {
            if(item.GetAge() > 40) item.Show();
        }
    }
}
