package com.pb.chubar.hw4;

import java.util.Scanner;

public class Anagram
{

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
        {   System.out.print("\n(Возможно что-то пошло не так или вариант не предусмотрен)");} //Вариант на всякий случай
    }








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






    }
}
