/*Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение. */

import java.util.Scanner; // импорт сканера

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст в строку 1:");
        String Stroka_1 = in.nextLine();
        System.out.println("Введите текст в строку 2:");
        String Stroka_2 = in.nextLine();
        int length_1 = Stroka_1.length();
        int length_2 = Stroka_2.length();
        if (length_1 > length_2)
            System.out.println("Строка с наибольшей длиной: \n" + Stroka_1);
        if (length_2 > length_1)
            System.out.println("Строка с наибольшей длиной: \n" + Stroka_2);
        else
            System.out.println("Длины строк одинаковые");
    }
}