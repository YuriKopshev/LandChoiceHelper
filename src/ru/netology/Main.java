package ru.netology;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ширину участка или '0' для завершения работы программы:");
            int input1 = scanner.nextInt();
            if (input1 == 0) {
                break;
            }
            System.out.println("Введите длину участка:");
            int input2 = scanner.nextInt();
            System.out.println("Введите цену за квадратный метр для проверки честности сделки:");
            int input3 = scanner.nextInt();
            int s = Estate.areaCounter(input1, input2);
            int sum = Estate.priceCounter(s, input3);
            Estate setl1 = new Estate(input1, input2, sum);
            setl1.checkFair();
        }
    }
}
