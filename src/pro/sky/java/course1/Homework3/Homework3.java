package pro.sky.java.course1.Homework3;

public class Homework3 {
    public static void main(String[] args) {

        task1();

        task2();

        task3();

        task4();

        task5();

        task6();

        task7();
    }

    private static void task1() {
        System.out.println("\n" + "1.");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке");
        } else {
            System.out.println("Установите версию для Android по ссылке");
        }
    }

    private static void task2() {
        System.out.println("\n" +  "2.");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2019) {
                System.out.println("Установите Lite-версию для iOs");
            } else {
                System.out.println("Установите версию для iOs");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2019) {
                System.out.println("Установите Lite-версию для Android");
            } else {
                System.out.println("Установите версию для Android");
            }
        }
    }

    private static void task3() {
        System.out.println("\n" + "3.");
        int year = 2020;
        boolean isYearLimp = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
        if (isYearLimp) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    private static void task4() {
        System.out.println("\n" + "4.");
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance >= 20) {
            deliveryDays++;
        }
        if (deliveryDistance >= 60) {
            deliveryDays++;
        }
        System.out.println("Доставка будет через " + deliveryDays);
    }

    private static void task5() {
        System.out.println("\n" + "5.");
        int monthNumber = 9;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна опять пришла");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Что такое осень? Это небо. Плачущее небо под ногами.");
        }
    }

    private static void task6() {
        System.out.println("\n" + "6.");
        double limit = 0;
        int age = 19;
        double salary = 58_000;
        double percent = 1.2;
        double percent1 = 1.5;
        if (age > 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
        }

        if (salary > 80_000) {
            limit *= percent1;
        } else if (salary > 50_000) {
            limit *= percent;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }

    private static void task7() {
        System.out.println("\n" + "7.");
        int age = 25;
        double salary = 60_000;
        double wantedSum = 330_000;
        double percent = 10;
        int countMonth = 12;
        double maxEveryMonthPay = salary / 2;
        if (age < 30 && age >= 23) {
            percent += 0.5;
        } else {
            percent ++ ;
        }
        if (salary > 80_000) {
            percent -= 0.7;
        }
        System.out.println("Ваша ставка равна " + percent);
        double theResultingSum = wantedSum + wantedSum / 100 * percent;
        System.out.println("Всего вы заплатите " + theResultingSum + " рублей");
        double monthlyFee = theResultingSum / countMonth;
        System.out.println("В месяц вы будете платить " + monthlyFee + " рублей");
        System.out.println("Максимальный ежемесячный платеж, считая вашу зарплату " + maxEveryMonthPay + " рублей");
        if (maxEveryMonthPay < monthlyFee) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxEveryMonthPay + " рублей." + " Платеж по кредиту " + monthlyFee + " рублей." + " Отказано.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxEveryMonthPay + " рублей." + " Платеж по кредиту " + monthlyFee + " рублей." + " Одобрено.");
        }
    }
}




