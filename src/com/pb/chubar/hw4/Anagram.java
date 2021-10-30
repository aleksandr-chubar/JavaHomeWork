package com.pb.chubar.hw4;


import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Anagram
{

    static void myPechatat(int value)           //Вывод информационных текстовых строк пользователю
    {
        if (value == 11) {
            value = value - 10;
            System.out.println("Введите текст " + value + " : \t\t\t\t\t\t\tДля выхода введите 000. Пробел - автоввод текста ");
        }
        else if (value == 12) {
            value = value - 10;
            System.out.println("Введите текст " + value + " : \t\t\t\t\t\t\tДля выхода введите 000. Пробел - автоввод текста ");
        } else if (value == 2) {
            System.out.print("Вы ввели текст: ");
        }

        else if (value == 9) {
            System.out.print("EXIT Вы выбрали завершить\n\n");
        } else {
            System.out.print("\n(Возможно что-то пошло не так или вариант не предусмотрен)\n");
        } //Вариант на всякий случай
    }

    static String LC(String text)  //LowerCase+ArraySort
    {

        char[] buffer = text.toLowerCase().toCharArray();
        Arrays.sort(buffer);
        String buffer1 = String.valueOf(buffer);
        return (buffer1);
    }


    static String LetterSF(String letters)
    {
        String pattern = "[А-Яа-я]+";
        String prostoslova = letters;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(prostoslova);
        while(m.find())
        {
            String bukvyIzTeksta = (prostoslova.substring(m.start(), m.end()));
            return (bukvyIzTeksta);
        }
        return pattern;
    }


    public static void main(String[] args) {

        int stroka;
        myPechatat(11);
        Scanner in1 = new Scanner(System.in);
        String text5 = in1.nextLine();    //Вариант ввода пользователем или след.строка ввод автоматически

        if (text5.equals("000"))    {stroka=9;  myPechatat(stroka);}                   //Пользователь выбрал выход
        if (text5.equals(" "))      {stroka=0;  myPechatat(stroka);}                   //Пользователь смотрит примеры
        myPechatat(12);
        Scanner in2 = new Scanner(System.in);
        String text6 = in2.nextLine();



        if (text6.equals("000"))  {  stroka=9;   myPechatat(stroka);     //Пользователь выбрал выход
            stroka=0;   myPechatat(stroka);                              //Пользователь смотрит примеры
        }
        if (text6.equals(" ") )
        {
            System.out.println("Хоть покажем примеры! :)");
        }




        String text1 = "Я в мире - сирота";
        String text2 = "Я в Риме - Ариост";
        String text3 = "Аз есмь строка, живу я, мерой остр";
        String text4 = "За семь морей ростка я вижу рост";
        System.out.println("Примеры текстов: \n Я в мире - сирота -> Я в Риме - Ариост\nАз есмь строка, живу я, мерой остр -> За семь морей ростка я вижу рост");

        String text1lc =LC(text1);  String text1letter = LetterSF(text1lc);
        String text2lc =LC(text2);  String text2letter = LetterSF(text2lc);
        String text3lc =LC(text3);  String text3letter = LetterSF(text3lc);
        String text4lc =LC(text4);  String text4letter = LetterSF(text4lc);
        String text5lc =LC(text5);  String text5letter = LetterSF(text5lc);
        String text6lc =LC(text6);  String text6letter = LetterSF(text6lc);

//        System.out.print("\nТекст 1 только буквы: \t \t" + text1letter);
//        System.out.print("\nТекст 2 только буквы: \t \t" + text2letter);
//        System.out.print("\nТекст 3 только буквы: \t \t" + text3letter);
//        System.out.print("\nТекст 4 только буквы: \t \t" + text4letter);
                System.out.print("\nВаш 1й введенный текст: \t \t" + text5letter);
                System.out.print("\nВаш 2й введенный текст: \t \t" + text6letter);



        System.out.println("\n\nТекст1 и Текст2 анаграмность:" + (text1letter.equals(text2letter)));
        System.out.println("Текст3 и Текст4 анаграмность:" + (text3letter.equals(text4letter)));
        System.out.println("Текст1 и Текст3 анаграмность:" + (text1letter.equals(text3letter)));

        System.out.println("Ваши введенные тексты:  " + (text5letter.equals(text6letter)));


    }
}