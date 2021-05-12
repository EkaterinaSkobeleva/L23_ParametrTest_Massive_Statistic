package ru.netology.statistic;

public class NumberOfMonthsBelowAverage {
    double calculate(double AverageSalesAmount) {

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Нахождение количества месяцев с вырочкой ниже среднего
        int quantityMounth = 0;

        for (int i = 0; i < arrayOfAmount.length; i++) {

            if (arrayOfAmount[i]<AverageSalesAmount) {
                quantityMounth=quantityMounth+1;
            }
        }

        System.out.println("Количество месяцев с вырочкой ниже среднего: " + quantityMounth);

        return quantityMounth;
    }
}
