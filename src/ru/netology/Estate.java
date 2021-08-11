package ru.netology;

public class Estate {
    private final int width;
    private final int length;
    private final int price;
    private static final int COST = 5000000;

    public Estate(int width, int length, int price) {
        this.width = width;
        this.length = length;
        this.price = price;
    }

    public static int areaCounter(Integer input1, Integer input2) {
        return input1 * input2;
    }

    public static int priceCounter(int s, int price) {
        return s * price;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getPrice() {
        return price;
    }

    public void checkFair() {
        if (getPrice() > COST) {
            System.out.println("Сумма сделки составила: " + getPrice() + " РУБЛЕЙ" + "\n" + "Сделка не честная!");
        } else {
            System.out.println("Сумма сделки составила: " + getPrice() + " РУБЛЕЙ" + "\n" + "Сделка одобрена!");
        }
    }
}


