package ru.geekbrains.second_hw;

public class Task123 {
    public static void task1(int mass[]){
        for(int i = 0; i < mass.length; i++){
            if(mass[i] == 0) mass[i] = 1;
            else mass[i] = 0;
        }
    }

    public static int[] task2(int mass[]){
        int val = 0;
        int i = 0;
        do{
            mass[i] = val;
            val+=3;
            i++;
        }while(i < mass.length);
        return mass;
    }

    public static int[] task3(int mass[]){
        for(int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) mass[i] *= 2;
        }
        return mass;
    }
}
