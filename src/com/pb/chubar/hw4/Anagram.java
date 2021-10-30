package com.pb.chubar.hw4;



import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//

//   ДОДЕЛЫВАЮ

//



public class Anagram
{

    static void myPechatat(int value)           //Вывод информационных текстовых строк пользователю
    {
        if (value == 11) {
            value = value - 10;
            System.out.println("Введите текст " + value + " : \nДля выхода введите 000. Пробел - автоввод текста ");
        }
        if (value == 12) {
            value = value - 10;
            System.out.println("Введите текст " + value + " : \nДля выхода введите 000. Пробел - автоввод текста ");
        } else if (value == 2) {
            System.out.print("Вы ввели текст: ");
        }
//        else if (value==3)
//        {   System.out.print("Ваш новый текст: ");   }
        else if (value == 9) {
            System.out.print("EXIT Вы выбрали завершить");
        } else {
            System.out.print("\n(Возможно что-то пошло не так или вариант не предусмотрен)");
        } //Вариант на всякий случай
    }

    static String LC(String text)  //LowerCase+ArraySort
    {

//        System.out.print("Текст словился методом: \t" + text);
        char[] buffer = text.toLowerCase().toCharArray();
        Arrays.sort(buffer);
        String buffer1 = String.valueOf(buffer);
//        System.out.println("\nНа выхлопе: \t" + buffer1);
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
//            System.out.println("bukvyIzTeksta " + bukvyIzTeksta);
            return (bukvyIzTeksta);
        }
        return pattern;
    }


    public static void main(String[] args) {
        String text1 = "Я в мире - сирота";
        String text2 = "Я в Риме - Ариост";
        String text3 = "Аз есмь строка, живу я, мерой остр";
        String text4 = "За семь морей ростка я вижу рост";

        String text1lc =LC(text1);  String text1letter = LetterSF(text1lc);
        String text2lc =LC(text2);  String text2letter = LetterSF(text2lc);
        String text3lc =LC(text3);  String text3letter = LetterSF(text3lc);
        String text4lc =LC(text4);  String text4letter = LetterSF(text4lc);

        System.out.print("\nТекст 1 только буквы: \t \t" + text1letter);
        System.out.print("\nТекст 2 только буквы: \t \t" + text2letter);
        System.out.print("\nТекст 3 только буквы: \t \t" + text3letter);
        System.out.print("\nТекст 4 только буквы: \t \t" + text4letter);

        System.out.println("\n\nТекст1 и Текст2 анаграмность:" + (text1letter.equals(text2letter)));
        System.out.println("Текст3 и Текст4 анаграмность:" + (text3letter.equals(text4letter)));
        System.out.println("Текст1 и Текст3 анаграмность:" + (text1letter.equals(text3letter)));





    }




//        String userText1;                   //Вари
//        String userText2;
//        char[] userText;
//        for (int i=0; i<1; i++){
//            int stroka=11;   myPechatat(stroka);                 //Информационная строка 1
//            Scanner in = new Scanner(System.in);

//            userText[i] = in.nextLine();    //Вариант ввода пользователем или след.строка ввод автоматически
//            if (userText.equals("000"))             //Блок проверки "выход", "автоввод", "нормальный режим"
//            {
//               stroka=9;   myPechatat(stroka);     //Пользователь выбрал выход
//               stroka=0;                           //Информирование, что вариант не предусмотрен
//               myPechatat(stroka);
//            }
//            if (userText.equals(" "))
//            {
//                int stroka=12;   myPechatat(stroka);                 //Информационная строка 1
//                userText[i] = (".");
//            }
//        }
//


//        String userText = String.valueOf((buffer));
//        System.out.print(" User Text " + userText);
//        System.out.print(" Buffer " + buffer);

//        if(Arrays.equals(t1, t2))
//            System.out.println("\ns1 is anagram of s2");
//        else
//            System.out.println("\nStrings are not anagram");


//}
}