package pro.sky.java.course1.Homework2;

public class Homework2 {
    public static void main(String[] args) {
        // задание 1
        //целочисленные
        System.out.println("");
        System.out.println("Ответы к 1 заданию:");
        byte a1 = 127;
        System.out.println("a1 = " + a1);
        short b1 = 500;
        System.out.println("b1 = " + b1);
        int c1 = 1000000;
        System.out.println("c1 = " + c1);
        long d1 = 373461247614721L;
        System.out.println("d1 = " + d1);
        //с плавающей запятой
        float e1 = 0.75f;
        System.out.println("e1 = " + e1);
        double f1 = 0.6666666;
        System.out.println("f1 = " + f1);
        //логическая
        boolean g1 = 10 > 5;
        System.out.println("g1 = " + g1);
        //символы
        char h1 = 34;
        System.out.println("h1 = " + h1);
        System.out.println("");

        //задание 2
        System.out.println("Ответы к заданию 2:");
        double firstBoxer = 78.2;
        System.out.println("firstBoxer = " + firstBoxer);
        double secondBoxer = 82.7;
        System.out.println("secondBoxer = " + secondBoxer);
        double totalWeight = firstBoxer + secondBoxer;
        System.out.println("totalWeight = " + totalWeight);
        double weightDifference = secondBoxer - firstBoxer;
        System.out.println("weightDifference = " + weightDifference);
        System.out.println("");

        //3 задание
        System.out.println("Ответы к заданию 3:");
        int bananasCount = 5;
        System.out.println("Количество бананов - " + bananasCount + " шт");
        int bananaWeight = 80;
        System.out.println("Вес одного банана равен " + bananaWeight + " гр");
        int bananasTotalWeight = (bananasCount * bananaWeight);
        System.out.println("Вес всех бананов равен " + bananasTotalWeight + " гр");
        int milkVolume = 200;
        System.out.println("Объем молока - " + milkVolume + " мл");
        int milkWeight = 105;
        System.out.println("Вес 100 мл молока равен " + milkWeight + " гр");
        double milkTotalWeight = (milkVolume / 100) * 105;
        System.out.println("Общий вес молока равен " + milkTotalWeight + " гр");
        int iceCreamPackageCount = 2;
        System.out.println("Количество упаковок мороженого - " + iceCreamPackageCount + " шт");
        int iceCreamPackageWeight = 100;
        System.out.println("Вес одной упаковки мороженого равен " + iceCreamPackageWeight + " гр");
        int iceCreamTotalWeight = (iceCreamPackageCount * iceCreamPackageWeight);
        System.out.println("Общий вес мороженого равен " + iceCreamTotalWeight + " гр");
        int eggsCount = 4;
        System.out.println("Количество яиц - " + eggsCount + " шт");
        int eggWeight = 70;
        System.out.println("Вес одного ИИЧКА равен " + eggWeight + " гр");
        int eggsTotalWeight = (eggsCount * eggWeight);
        System.out.println("Общий вес яиц равен " + eggsTotalWeight + " гр");
        double productsTotalWeight = (bananasTotalWeight + milkTotalWeight + iceCreamTotalWeight + eggsTotalWeight);
        System.out.println("Общий вес продуктов равен " + productsTotalWeight + " гр или " + (productsTotalWeight / 1000) + " кг");
        System.out.println("");

        //4 задание
        System.out.println("Ответы к заданию 4:");
        int excessWeight = 7;
        System.out.println("Необходимо сбросить " + excessWeight + " кг");
        double firstPlan = 250;
        System.out.println("Потеря  " + firstPlan + " гр в день по 1 плану или " + (firstPlan / 1000) + " кг в день");
        double secondPlan = 500;
        System.out.println("Потеря " + secondPlan + " гр в день по 2 плану или " + (secondPlan / 1000) + " кг в день");
        double days1 = 7 / (firstPlan / 1000);
        System.out.println(days1 + " дней понадобится чтобы сбросить по первому плану");
        double days2 = 7 / (secondPlan / 1000);
        System.out.println(days2 + " дней понадобится чтобы сбросить по второй программе");
        double daysVolume = (days1 + days2) / 2;
        System.out.println(daysVolume + " дней в среднем понадобится, чтобы сбросить вес");
        System.out.println("");

        //5 задание
        System.out.println("Ответы к заданию 5:");
        double mashaSalary = 67_760;
        double denisSalary = 83_690;
        double kristinaSalary = 76_230;
        double newMashaSalary = mashaSalary * 1.1;
        System.out.println("Теперь Маша зарабатывает  " + newMashaSalary + " рублей в месяц");
        double newDenisSalary = denisSalary + (denisSalary / 10);
        System.out.println("Теперь Денис зарабатывает  " + newDenisSalary + " рублей в месяц");
        double newKristinaSalary = kristinaSalary * 1.1;
        System.out.println("Теперь Кристина зарабатывает  " + newKristinaSalary + " рублей в месяц");
        double mashaYearSalaryDifference = (newMashaSalary * 12) - (mashaSalary * 12);
        System.out.println("Годовой доход Маши вырос на " + mashaYearSalaryDifference + " рублей");
        double denisYearSalaryDifference = (newDenisSalary * 12) - (denisSalary * 12);
        System.out.println("Годовой доход Дениса вырос на " + denisYearSalaryDifference + " рублей");
        double kristinaYearSalaryDifference = (newKristinaSalary *12) - (kristinaSalary * 12);
        System.out.println("Годовой доход Кристины вырос на " + kristinaYearSalaryDifference + " рублей");
        System.out.println("");

        //ЗАДАНИЯ СО *

        //задание 6
        System.out.println("Ответы к заданию 6:");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println("result = " + result);
        result = result * (-1);
        System.out.println("result = " + result);
        System.out.println("");

        //7 задние
        System.out.println("Ответы к заданию 7:");
        int k = 5;
        int i = 7;
        k = k + (i - k);
        System.out.println("k = " + k);
        i = i - (i / i) - (i / i);
        System.out.println("i = " + i);
        System.out.println("");

        // задание 8
        System.out.println("Ответы к заданию 8:");
        int a2 = 318;
        a2 %= 100;
        int b2 = a2 / 10;
        System.out.println("b2 = " + b2);
    }
}
