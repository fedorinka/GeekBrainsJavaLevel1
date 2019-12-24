package ru.geekbrains.second_hw;

public class Task6 {
    public static boolean checkBalance(int[] mass){
        for(int i = 0; i < mass.length; i++){
            int sum_left = 0;
            int sum_right = 0;
            for(int i_left = 0; i_left <= i; i_left++){
                sum_left = sum_left + mass[i_left];
            }
            for(int i_right = mass.length-1; i_right > i; i_right--){
                sum_right = sum_right + mass[i_right];
            }
            if(sum_left == sum_right) return true;
        }
        return false;
    }

}
