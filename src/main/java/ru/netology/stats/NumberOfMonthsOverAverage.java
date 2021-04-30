package ru.netology.stats;

public class NumberOfMonthsOverAverage {
    double calculate(double AverageSalesAmount) {

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Нахождение количества месяцев с вырочкой выше среднего
        int quantityMounth = 0;

        for (int i = 1; i < arrayOfAmount.length; i++) {

            if (arrayOfAmount[i] > AverageSalesAmount) {
                quantityMounth = quantityMounth + 1;
            }
        }

        System.out.println("Количество месяцев с вырочкой выше среднего: " + quantityMounth);

        return quantityMounth;
    }
}
