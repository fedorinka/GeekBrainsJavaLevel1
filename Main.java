package ru.geekbrains.second_hw;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Task123 task123 = new Task123();
        // первая задача: заменить в массиве нули на единицы и наоборот
        int[] bits = {0,1,1,1,0,0,1,0,1,0};
        task123.task1(bits);
        System.out.println("Результат первой задачи: "+ Arrays.toString(bits));

        // вторая задача: заполнение массива значениями в цикле
        int seqs[] = new int[8];
        System.out.println("Результат второй задачи:");
        System.out.println(Arrays.toString(task123.task2(seqs)));

        //третья задача: умножение на два элементов, которые меньше 6ти
        int mults[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Результат третьей задачи:");
        System.out.println(Arrays.toString(task123.task3(mults)));

        //четвертая задача: матрица с единичной диагональю
        int size = 5;
        Task4 task4 = new Task4();
        System.out.println("Главная диагональ единичная:");
        Task4.printSquareMass(Task4.task4MainDiagonal(size));

        System.out.println("Побочная диагональ единичная:");
        Task4.printSquareMass(Task4.task4IncidentalDiagonal(size));

        System.out.println("Обе диагонали единичные:");
        Task4.printSquareMass(Task4.task4BothDiagonals(size));

        //пятая задача: поиск экстремумов в одномерном массиве
        int size2 = 10;
        int range = 100;
        Task5 task5 = new Task5();
        task5.task5(size2, range);

        //шестая задача: поиск центра масс массива
        int[] mass = {1,1,1,2,1,6};
        Task6 task6 = new Task6();
        if(task6.checkBalance(mass)) System.out.println("В массиве есть центр массы.");
        else System.out.println("В массиве нет центра массы.");

        //седьмая задача: сдвиг массива на n позиций
        int[] mass2 = {1,1,1,2,1,6};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(mass2));
        int n = -14;
        Task7 task7 = new Task7();
        System.out.println("Результат сдвига на " + n + " позиций:");
        System.out.println(Arrays.toString(task7.task7(mass2,n)));

        }
}
