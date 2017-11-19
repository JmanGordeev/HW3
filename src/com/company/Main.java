package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите радиус окружности: ");
        Scanner sc = new Scanner(System.in);

        double r = Double.parseDouble(sc.next()); //подсказала IDE, double r = sc.nextDouble() - ошибка при вводе вещ. числа, но с интами работает о_О
        //double r = sc.nextDouble() но вроде ошибка из-за локализации, зависимость от "." или "," >_<
        double l = Math.PI * 2 * r;
        System.out.println("Длинна окружности равна: " + l);

    }
}
