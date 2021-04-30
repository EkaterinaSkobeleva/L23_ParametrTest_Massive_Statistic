package ru.netology.stats;

public class AverageSalesAmount {
    double calculate() {

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Сумма элементов массива
        double totalSumArray = 0;
        for (int i = 0; i < arrayOfAmount.length; i++) {
            totalSumArray += arrayOfAmount[i];
        }

        double averageSalesAmount = totalSumArray/12;
        System.out.println("Средняя сумма продаж в месяц: " + averageSalesAmount);

        return  averageSalesAmount;
    }
}