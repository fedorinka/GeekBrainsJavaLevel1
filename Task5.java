package ru.geekbrains.second_hw;

import java.util.Arrays;

public class Task5 {
    public static void task5(int size, int range){
    int mass[] = new int[size];
    //инициализация массива
    for(int i = 0; i < size; i++)
        mass[i] = (int) (Math.random() * range);

    //печать массива
    System.out.println("Массив для поиска экстремумов: " + Arrays.toString(mass));

    //переменные для хранения минимального и максимального значений и их индексов
    int max = 0;
    int i_max = 0;
    int min = mass[0];
    int i_min = 0;

    for (int i = 0; i < size; i++){
        if(mass[i] > max) {max = mass[i]; i_max = i;}
        if(mass[i] < min) {min = mass[i]; i_min = i;}
    }

    System.out.println("Минимальное значение в массиве равно " + min + " с индексом " + i_min);

    System.out.println("Максимальное значение в массиве равно " + max + " с индексом " + i_max);

    }

}
