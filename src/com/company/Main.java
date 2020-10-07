package com.company;

import java.util.Scanner;

public class Main {

    public static int minBalls(int k, int x, int y) {
        return Math.max(Math.min(x, y) + 2, k) - Math.max(x, y);
    }

    public static void main(String[] args) {
        System.out.println("Введите количество матчей:");
        Scanner in = new Scanner(System.in);
        int iter = in.nextInt();
        for(int i=0;i<iter;i++) {
            System.out.println("Введите разделенные пробелами K, X и Y с клавиатуры:");
            int k = in.nextInt(), x = in.nextInt(), y = in.nextInt();
            System.out.println("Минимальное количество мячей: " + minBalls(k, x, y));
        }


    }
}
