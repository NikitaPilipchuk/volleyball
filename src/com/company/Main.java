package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

	    int n = in.nextInt(); // Количества тестов
        String str = in2.nextLine(); // Строка

        String[] subStr = str.split(" ");

        if (subStr.length == 3) {
            for (int i = 0; i < n; i++) {
                int k = Integer.parseInt(subStr[0]);
                int a = Integer.parseInt(subStr[1]);
                int b = Integer.parseInt(subStr[2]);

                int c = max(a, b);
                int d = min(a, b);

                if (d <= k - 2) {
                    System.out.println("Ответ: " + (k - c));
                } else {
                    System.out.println("Ответ: " + (d + 2 - c));
                }
            }
        } else {
            System.out.println("Ошибка ввода! Строка должна содержать три целых числа, разделенных пробелами.");
        }



    }
}
