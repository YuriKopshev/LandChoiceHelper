package ru.netology;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ширину участка или '0' для завершения работы программы:");
            int width = scanner.nextInt();
            if (width== 0) {
                break;
            }
            System.out.println("Введите длину участка:");
            int length = scanner.nextInt();
            System.out.println("Введите цену за квадратный метр для проверки честности сделки:");
            int pricePerMetr = scanner.nextInt();
            int squareSize = Estate.areaCounter(width, length);
            int sum = Estate.priceCounter(squareSize, pricePerMetr);
            Estate myFutureSetle = new Estate(width, length, sum);
            myFutureSetle.checkFair();
        }
    }
}
