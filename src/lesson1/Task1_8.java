package lesson1;

public class Task1_8 {
    public static void main(String[] args) {
        Task1_8 year = new Task1_8();
        year.leapYear(2000);
        year.leapYear(1000);
        year.leapYear(2016);
        year.leapYear(2021);
    }

    public void leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " высокосный год");
                } else {
                    System.out.println(year + " не высокосный год");
                }
            } else {
                System.out.println(year + " высокосный год");
            }
        } else {
            System.out.println(year + " не высокосный год");
        }
    }
}
