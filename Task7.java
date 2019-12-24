package ru.geekbrains.second_hw;

import java.util.Arrays;

public class Task7 {
    public static int[] task7(int[] mass, int n){
        int size = mass.length;
        if(Math.abs(n) > size) n = n % size;
        if(n > 0) moveToRight(mass, n);
        if(n < 0) moveToLeft(mass, n);
        return mass;
    }

    public static void moveToRight(int[] mass, int n){
        while(n > 0){
            int temp = mass[mass.length - 1];
            for(int i = mass.length - 1; i > 0; i--){
                mass[i] = mass[i-1];
            }
            mass[0] = temp;
            n--;
        }
    }

    public static void moveToLeft(int[] mass, int n){
        n = Math.abs(n);
        while(n > 0){
            int temp = mass[0];
            for(int i = 0; i < mass.length-1; i++){
                mass[i] = mass[i+1];
            }
            mass[mass.length-1] = temp;
            n--;
        }
    }
}
