package com.pb.chubar.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int sum = 0;                    //Переменная сумма
        int sizeI = 10;                 //Размер массива
        int[] array = new int [sizeI];
        int countPlus = 0;              //Счетчики положительных
        int countMinus = 0;             //Счетчики отрицательны
        int countZero = 0;              //Счетчики нулевых значений


        // Цикл ввода значений в массив
        for (int i=0; i < sizeI; i++){
            System.out.println("Введите значение " + (i+1) + " ячейки массива:"); //+1 для отображения пользователю
            Scanner scan = new Scanner(System.in);
            array[i] = scan.nextInt();
        }

        // Отображение всех внесенных данных для перепроверки
        System.out.print("\nВы ввели такие значения:\n");
        for (int i=0; i < sizeI; i++) {
        //    System.out.print("Ячейка " + (i+1) + "; Значение:" + array[i] );

            System.out.print(" " + array[i] );              //Вывод всех значений
            sum = sum + array[i];                           //Подсчет суммы

            //Подсчет положительных, отрицательных и нулевых чисел
            if (array [i]<0){ countMinus++;  }
            else if (array [i]==0) { countZero++;}
            else if (array[i] > 0) { countPlus++; }
        }
        System.out.print("\n" + "Положительных: " + countPlus + ";\nОтрицательных: " + countMinus + ";\nНулевые: " + countZero);
        System.out.print("; \nСумма итого = " + sum + ".\n");       //Вывод итоговой суммы всех значений


        // Сортировка
        boolean isSorted = false;
        while (!isSorted)
        {
            isSorted=true;
            for (int i=1; i < sizeI; i++)
            {
                if (array[i] < array[i - 1])
                {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }

        //Вывод уже отсортированного массива
        System.out.print("\nОтсортированный массив:\n");
        for (int i=0; i < sizeI; i++)
        {
            System.out.print(" " + array[i] );
        }
    }
}
