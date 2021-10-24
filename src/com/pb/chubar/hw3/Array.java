package com.pb.chubar.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int sum = 0;
        int sizeI = 10;
        int[] array = new int [sizeI];
        int countPlus = 0;
        int countMinus = 0;
        int countZero = 0;
        //5int zero = zero[0];

        // Цикл ввода значений в массив
        for (int i=0; i < sizeI; i++){
            System.out.println("Введите значение " + (i+1) + " ячейки массива:");
            Scanner scan = new Scanner(System.in);
            array[i] = scan.nextInt();
        }

        // Отображение всех внесенных данных для перепроверки
        for (int i=0; i < sizeI; i++) {
        //    System.out.print("Ячейка " + (i+1) + "; Значение:" + array[i] );
            System.out.print(" " + array[i] );              //Вывод всех значений

            sum = sum + array[i];                           //Подсчет суммы
        //    System.out.print("; Сумма = " + sum);         //Вывод суммы (для проверки)

            //Подсчет положительных, отрицательных и нулевых чисел
            if (array [i]<0){ countMinus++;  }
            else if (array [i]==0) { countZero++;}
            else if (array[i] > 0) { countPlus++; }



        }
        System.out.print("\n" + "Положительных: " + countPlus + ";\nОтрицательных: " + countMinus + ";\nНулевые: " + countZero);
        System.out.print("; \nСумма итого = " + sum + ".");               //Итоговая сумма
        // Сортировка
        // ЕЩЕ НЕ ДОДЕЛАЛ ! ! !


















    }
}
