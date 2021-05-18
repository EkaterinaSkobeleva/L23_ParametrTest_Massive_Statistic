package ru.netology.statistic;

public class StatisticService {

    //сумма всех продаж
    public int salesAmount(int[] arrayOfAmount) {

        int totalSumArray = 0;

        for (int i = 0; i < arrayOfAmount.length; i++) {
            totalSumArray += arrayOfAmount[i];
        }
        // System.out.println("Сумма всех продаж: " + totalSumArray);

        return totalSumArray;
    }

    // Средняя сумма продаж в месяц
    public double averageSalesAmount(int[] arrayOfAmount) {

        double averageSalesAmount = salesAmount(arrayOfAmount) / 12;

        // System.out.println("Средняя сумма продаж в месяц: " + averageSalesAmount);

        return averageSalesAmount;
    }

    //последний месяц c продажами на максимальную сумму
    public int peakMaxSalesMonth(int[] arrayOfAmount) {

        int maxMonth = arrayOfAmount[0];
        int maxIdMonth = 0;

        for (int i = 0; i < arrayOfAmount.length; i++) {
            if (arrayOfAmount[i] > maxMonth) {
                maxMonth = arrayOfAmount[i];
                maxIdMonth = i;
            }
        }
        //индексы массива начинаются с 0, т.е. для 12 элементов, последний  = 11
        // System.out.println("Последний месяц c продажами на максимальную сумму: " + maxIdMonth);

        return maxIdMonth;
    }

    //последний месяц c продажами на минимальную сумму
    public int peakMinSalesMonth(int[] arrayOfAmount) {

        int minAmount = arrayOfAmount[0];
        int minIdMonth = 0;

        for (int i = 0; i < arrayOfAmount.length; i++) {
            if (arrayOfAmount[i] <= minAmount) {
                minAmount = arrayOfAmount[i];
                minIdMonth = i;
            }

        }

        //System.out.println("Последний месяц c продажами на минимальную сумму: " + minIdMonth);

        return minIdMonth;
    }

    // Нахождение количества месяцев с вырочкой ниже среднего
    public int numberOfMonthsBelowAverage(int[] arrayOfAmount) {

        int quantityMonth = 0;

        for (int i = 0; i < arrayOfAmount.length; i++) {
            if (arrayOfAmount[i] < averageSalesAmount(arrayOfAmount)) {
                quantityMonth = quantityMonth + 1;
            }
        }
        // System.out.println("Количество месяцев с вырочкой ниже среднего: " + quantityMonth);
        return quantityMonth;
    }

    // Нахождение количества месяцев с вырочкой выше среднего
    public int numberOfMonthsOverAverage(int[] arrayOfAmount) {

        int quantityMonth = 0;

        for (int i = 0; i < arrayOfAmount.length; i++) {
            if (arrayOfAmount[i] > averageSalesAmount(arrayOfAmount)) {
                quantityMonth = quantityMonth + 1;
            }
        }
        // System.out.println("Количество месяцев с вырочкой выше среднего: " + quantityMonth);

        return quantityMonth;
    }
}