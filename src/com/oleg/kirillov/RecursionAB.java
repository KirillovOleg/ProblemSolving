package com.oleg.kirillov;

import java.util.Scanner;

public class RecursionAB {
    //  Даны два целых числа A и В (каждое в отдельной строке).
    //  Выведите все числа от A до B включительно, в порядке возрастания,
    //  если A < B, или в порядке убывания в противном случае.
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int a = input();
        System.out.println("Введите второе число: ");
        int b = input();
        out(a, b);

    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Не корректный ввод. повторите ввод.");
            return input();
        }
    }

    public static void out(int a, int b) {
        if (a > b) {
            recursFront(a, b);
        } else {
            recursBack(a, b);
        }
    }


    public static void recursFront(int a, int b) {
        System.out.print(" " + a);
        if (a > b) {
            recursFront(a - 1, b);
        }
    }

    public static void recursBack(int a, int b) {
        if (a < b) {
            recursBack(a, b - 1);
        }
        System.out.print(" " + b);
    }

}