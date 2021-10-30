package com.pb.chubar.hw4;

import java.util.Scanner;

public class CapitalLetter {


    static void myPechatat(int value)           //Вывод информационных текстовых строк пользователю
    {
        if (value==1)
        {   System.out.println("Введите текст: \nДля выхода введите 000. Пробел - автоввод текста ");     }
        else if (value==2)
        {   System.out.print("Вы ввели текст: ");    }
        else if (value==3)
        {   System.out.print("Ваш новый текст: ");   }
        else if (value==4)
        {   System.out.print("EXIT Вы выбрали завершить");}
        else
        {   System.out.print("\n(Возможно что-то пошло не так)");} //Вариант на всякий случай
    }

    static void myPechatat(String GOTOVO)  //Вывод обработанного текста, введенного пользователем
    {   System.out.println(GOTOVO);    }



    public static void main(String[] args)
    {
        int stroka=1;   myPechatat(stroka);                 //Информационная строка 1

        Scanner in = new Scanner(System.in);

        String userText = in.nextLine();    //Вариант ввода пользователем или след.строка ввод автоматически


        if (userText.equals("000"))
        {
            stroka=4;   myPechatat(stroka);     //Пользователь выбрал выход
            stroka=0;
            myPechatat(stroka);
        }
        if (userText.equals(" "))
        {
            userText = ("Единственный брак, который доставляет мужчине непритворную радость, — это замужество его дочери.");
        }


    if (stroka==1)
        {
            stroka++;
            myPechatat(stroka);                 //Информационная строка 2 если прошли проверки 000 выход, пробел автоввод
            myPechatat(userText);
        }


    char[] bukva = userText.toCharArray();              //Переводим текст в массив букв


        for (int i = 0; i < bukva.length; i++)              //Этот цикл делает все буквы прописными
        {   bukva[i] = Character.toLowerCase(bukva[i]); }


        for (int i = 0; i < bukva.length; i++)              //Этот цикл делает заглавными первую букву строки и первые после пробела буквы
        {
            Character probel = bukva[i];
            bukva[0] = Character.toUpperCase(bukva[0]);

            if (probel.equals(' '))
            {
                bukva[i+1] = Character.toUpperCase(bukva[i+1]);
            }
        }

        userText = String.valueOf((bukva));                 //Переводим массив в String(текст для печати)

        if (stroka==2)
        {
            stroka++;
            myPechatat(stroka);                 //Информационная строка 3 если прошли проверки 000-выход, пробел-автоввод
            myPechatat(userText);
        }

    }
}