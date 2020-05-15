package com.oleg.kirillov;

public class SumNumber {
    //Сумма цифр числа
    //Дано натуральное число N. Вычислите сумму его цифр.
    //При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
    public static void main(String[] args) {
        int n = 125;
    sum(n);


    }

    public static void sum(int n) {
        if (n  > 0) {
             int i = n%10;
            System.out.print(i);
            sum((n-n%10)/10);
        }

        }
    }



