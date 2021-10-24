package pro.sky.java.course1.Homework6;

public class Homework6 {
    public static void main(String[] args) {
        task1();

        task2();

        task3();

        task4();

        task5();

        task6();

        task7();

        task8();
    }

    private static void task1() {
        System.out.println("\n" + "1.");
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich";
        String fullName = middleName + firstName + lastName;
        System.out.println("ФИО сотрудника – " + fullName);
    }

    private static void task2() {
        System.out.println("\n" + "2.");
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullName);
    }

    private static void task3() {
        System.out.println("\n" + "3.");
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела – " + fullName);
    }

    private static void task4() {
        System.out.println("\n" + "4.");
        String fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "е");
        }
        System.out.println("Данные ФИО сотрудника – " + fullName);
    }

    private static void task5() {
        System.out.println("\n" + "5.");
        String fullName = "Ivanov Ivan Ivanovich";
        int lastIndex = fullName.lastIndexOf(' ');
        String firstName = fullName.substring(fullName.indexOf(' '), lastIndex);
        String lastName = fullName.substring(lastIndex);
        String middleName = fullName.replace(lastName, "");
        middleName = middleName.replace(firstName, "");
        System.out.println("Имя сотрудника –" + firstName);
        System.out.println("Фамилия сотрудника – " + middleName);
        System.out.println("Отчество сотрудника –" + lastName);
    }

    private static void task6() {
        System.out.println("\n" + "6.");
        String fullName = "ivanov ivan ivanovich";
        char[] symbols = fullName.toCharArray();
        symbols[0] = Character.toUpperCase(symbols[0]);
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == ' ') {
                if (symbols[i + 1] < symbols.length)
                    symbols[i + 1] = Character.toUpperCase(symbols[i + 1]);
            }
        }
        fullName = new String(symbols);
        System.out.println("Верное написание ФИО сотрудника с заглавных букв – " + fullName);
    }

    private static void task7() {
        System.out.println("\n" + "7.");
        String first = "135";
        String second = "246";
        StringBuilder total = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            total.append(first.charAt(i));
            total.append(second.charAt(i));
        }
        System.out.println(total);
    }

    private static void task8() {
        System.out.println("\n" + "8.");
        String letters = "aabccddefgghiijjkk";
        for (int i = 0; i < letters.length(); i++) {
            for (int j = i + 1; j < letters.length(); j++) {
                if (letters.charAt(i) == letters.charAt(j)) {
                    System.out.print(letters.charAt(i));
                }
            }
        }
    }
}
