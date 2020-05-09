package lesson1;

public class Task1_8 {
    public static void main(String[] args) {
        Task1_8 year = new Task1_8();

        year.leapYear1(2000);
        year.leapYear1(1000);
        year.leapYear1(2016);
        year.leapYear1(2021);
    }

    public void leapYear1(int year) {
            if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
                System.out.println(year + " не високосный год");
            } else {
                System.out.println(year + " високосный год");
            }
    }
}
