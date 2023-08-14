package guru.qa;

public class Main {
    public static void main(String[] args) {

        //0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        //1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        //2) попробовать вычисления комбинаций типов данных (int и double)

        boolean boolVar = false;

        byte byteVar = -127;  // -128 ... 127
        short shortVar = 32767;  // -32768 ... 32767
        int intVar = 2147483647;  // -2147483648 ... 2147483647
        long longVar = 9223372036854775806L;  // -9223372036854775808 ... 9223372036854775807
        char charVar = (char) 25;  // -128 до 127

        float floatVar = 1.0F; // 1.4e-45f ... 3.4e+38f
        double doubleVar = 1; // 4.9e-324 ... 1.7e+308

        //переполнение при вычислениях
        System.out.println("Переполнение с типом intVar: " + (Integer.MAX_VALUE + 1));
        System.out.println("Переполнение с типом longVar: " + (Long.MAX_VALUE + 1));

        //математические операции
        int number = 100;

        System.out.println("Операция +: " + (number + 50));
        System.out.println("Операция -: " + (number - 50));
        System.out.println("Операция /: " + (number / 50));
        System.out.println("Операция *: " + (number * 50));
        System.out.println("Операция %: " + (number % 49));

        //логические операции
        int number1 = 100;
        int number2 = 150;

        System.out.println("Операция ==: " + (number1 == number2));
        System.out.println("Операция >=: " + (number1 >= number2));
        System.out.println("Операция <=: " + (number1 <= number2));
        System.out.println("Операция <: " + (number1 < number2));
        System.out.println("Операция >: " + (number1 > number2));
        System.out.println("Операция !=: " + (number1 != number2));

        //условие в одну строчку

        int price = 100;
        String change = String.valueOf(price == 100 ? 50 : 40);

        System.out.println("change = " + change);

        //вычисление double и int

        System.out.println("Операция +: " + (100 + 60.5));
        System.out.println("Операция -: " + (100 - 60.5));
        System.out.println("Операция *: " + (100 * 60.5));
        System.out.println("Операция /: " + (100 / 60.5));
        System.out.println("Операция %: " + (100 % 60.5));

    }
}