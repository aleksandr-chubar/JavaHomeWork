package com.pb.chubar.hw2;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        int operand1;
        int operand2;
        int result;
        String sign;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        operand1 = scan.nextInt();
        System.out.println("Введите второе число:");
        operand2 = scan.nextInt();
        System.out.println("Вы ввели такие числа:");
        System.out.println(" Первое число = " + operand1 + ";" + " Второе число = " + operand2 + ".");
        System.out.println("Введите действие из доступных вариантов (+ - * /):");
        sign = scan.next();

        switch (sign) {

            case "+":
                result = operand1 + operand2;
                System.out.println("Результат = " + (result));
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println("Результат = " + (result));
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println("Результат = " + (result));
                break;
            case "/":
            {
                if (operand2 == 0)
                {
                    System.out.println("Нельзя поделить на 0!!!");
                }
                else
                {
                    result = operand1 / operand2;
                    System.out.println("Результат = " + (result));
                }
                break;
            }
                default:
                    System.out.println("Нет такого варианта действий или не предусмотрено!!! :) ");
            }

        }
    }

