package pro.sky.java.course1.Homework4;

public class Homework4 {
    public static void main(String[] args) {
        task1();

        task2();

        task3();

        task4();

        task5();

    }

    private static void task1() {
        System.out.println("\n" + "1.");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    private static void task2() {
        System.out.println("2.");
        int friday = 6;
        for (int i = 1; i <= 31; i++) {
            if (i == friday) {
                System.out.println("Сегодня пятница," + friday + "-ое число. Необходимо подготовить отчет.");
                friday = friday +7;
            }
        }
    }

    private static void task3() {
        System.out.println("\n" + "3.");
        int year = 2021;
        int nextYear = year + 100;
        for ( int lastYear = year - 200; lastYear <= nextYear ; lastYear++) {
            if (lastYear % 79 == 0) {
                System.out.println(lastYear);
            }
        }
    }

    private static void task4() {
        System.out.println("\n" + "4.");
        for (int i = 1; i <= 30; i++) {
            System.out.println();
            System.out.print(i +":");
            if (i % 3 == 0) {
                System.out.print("ping ");
            }
            if (i % 5 == 0) {
                System.out.print("pong ");
            }
        }
        System.out.println("\n");
    }

    private static void task5() {
        System.out.println("5.");
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 0; i<=7; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }
}
