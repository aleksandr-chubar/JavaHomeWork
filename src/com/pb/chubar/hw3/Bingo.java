package com.pb.chubar.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo
{
    public static void main(String[] args)
    {        Random random = new Random();
        int Zagadano = random.nextInt(101);
        int Otgadka;
        int Popytka;

        //Закоментирована строка для перепроверки загаданного числа
        System.out.println("Число по секрету: " + Zagadano + " :)");

        System.out.println("Здравствуйте! Давайте поиграем в игру - Bingo!");
        System.out.println("Пока не получилось сделать выход в любой момент, используя символ, отличный от цифр :(. ");
        System.out.println("Чтобы завершить игру используйте отрицательное число (со знаком минус)");
        System.out.println("У Вас 10 попыток, чтобы угадать загаданное число");
        System.out.println("Введите число от 0 до 100:");
        for (Popytka=1;Popytka<=10;Popytka++)
        {

            Scanner scan = new Scanner(System.in);
            System.out.println("");
        Otgadka = scan.nextInt();

        if (Otgadka>=0 && Otgadka<101)  //Проверка на числовой диапазон от 0 до 100
            {
                if (Otgadka > Zagadano && Otgadka <=100)
                    { System.out.println("Не угадали, загаданное число меньше. " + "Сделано попыток:" + Popytka); }

                else if (Otgadka < Zagadano)
                    { System.out.println("Не угадали, загаданное число больше. " + "Сделано попыток: " + Popytka); }

                else if (Otgadka == Zagadano)
                    {System.out.println("ПОЗДРОВЛЯЕМ!!! Вы угадали с " + Popytka + "й попытки!!! :)" ); Popytka=100; }

                else { System.out.println("Что-то пошло не так"); Popytka=100; }
            }

        else
            {
                if (Otgadka < 0){
                System.out.println("Значение меньше 0 " + Otgadka + " GAME OVER!!!");
                Popytka=100;}
                else { System.out.println("Вне диапазона чисел " + Otgadka + " GAME OVER!!!"); }

            }
        }
    }
}

// P.S. Потратил много времени, не получается сделать проверку на только цифры.
// И не пойму, как полнстью завершить работу программы с выходом.
// Сделал через Popytka=100, чтоб при окончании просто завершало цикл.