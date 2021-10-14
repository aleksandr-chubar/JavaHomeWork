package com.pb.chubar.hw2;

import java.util.Scanner;

public class Interval
{
    public static void main(String[] args)
    {
        int vozrast;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваш возраст (полных лет):");
        vozrast = scan.nextInt();

        if (vozrast > 0 && vozrast <= 14)
        {
            System.out.println("Вам " + vozrast + " лет." + "Вы очень молоды! [0-14]");
        }
        else if (vozrast >= 15 && vozrast <= 35)
        {
            System.out.println("Вам " + vozrast + " лет." + "Вы молоды!!! [15-35]");
        }
        else if (vozrast >= 36 && vozrast <= 50)
        {
            System.out.println("Вам " + vozrast + " лет." + "У Вас зрелый возраст!!![36-50]");
        }
        else if (vozrast >= 51 && vozrast <= 100)
        {
            System.out.println("Вам " + vozrast + " лет." + "Вы уже постарели!!![51-100]");
        }
        else
        {
            System.out.println("Вам " + vozrast + " лет." + "Столько не живут!!! :) [Вне допустимого диапазона]");
        }
    }
}
