package ru.geekbrains.second_hw;

public class Task4 {
    public static int[][] task4MainDiagonal(int size){
     int[][] mass = new int[size][size];
     for(int i = 0; i < size; i++) mass[i][i] = 1;
     return mass;
    }

    public static int[][] task4IncidentalDiagonal(int size){
        int[][] mass = new int[size][size];
        for(int i = 0; i < size; i++) mass[size - i - 1][i] = 1;
        return mass;
    }

    public static int[][] task4BothDiagonals(int size){
        int[][] mass = new int[size][size];
        for(int i = 0; i < size; i++){
            mass[i][i] = 1;
            mass[size - i - 1][i] = 1;
        }
        return mass;
    }

    public static void printSquareMass(int[][] mass){
        for(int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) System.out.print(mass[i][j] + " ");
            System.out.print("\n");
        }
    }
}
