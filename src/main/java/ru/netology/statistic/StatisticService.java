package ru.netology.statistic;

public class StatisticService {

    public int SalesAmount(int[] arrayOfAmount) {
        // Сумма элементов массива
        int totalSumArray = 0;
        int lengthOfArray = arrayOfAmount.length;

        for (int i = 0; i < lengthOfArray; i++) {
            totalSumArray += arrayOfAmount[i];
        }
        // System.out.println("Сумма всех продаж: " + totalSumArray);

        return totalSumArray;
    }

    public double AverageSalesAmount(int[] arrayOfAmount) {

        int lengthOfArray = arrayOfAmount.length;
        // Сумма элементов массива
        double totalSumArray = 0;
                //SalesAmount(arrayOfAmount);

        for (int i = 0; i < arrayOfAmount.length; i++) {
            totalSumArray += arrayOfAmount[i];
        }

        double averageSalesAmount = totalSumArray / 12;
        // System.out.println("Средняя сумма продаж в месяц: " + averageSalesAmount);

        return averageSalesAmount;
    }

    public int PeakMaxSalesMonth(int[] arrayOfAmount) {

        //последний месяц c продажами на максимальную сумму
        int maxMonth = arrayOfAmount[0];
        int maxIdMonth = 0;

        for (int i = 0; i < arrayOfAmount.length; i++) {
            if (arrayOfAmount[i] > maxMonth) {
                maxMonth = arrayOfAmount[i];
                maxIdMonth = i;
            }
        }
        // Вывести на экран все элементы массива
        // for (int i = 0; i < arrayOfAmount.length; i++) {
        //   System.out.print(arrayOfAmount[i] + " " + i + " ");
        //}
        //индексы массива начинаются с 0, т.е. для 12 элементов, последний  = 11
        System.out.println("Последний месяц c продажами на максимальную сумму: " + maxIdMonth);

        return maxIdMonth;
    }

    public int PeakMinSalesMonth(int[] arrayOfAmount) {

        //последний месяц c продажами на минимальную сумму
        int minAmount = arrayOfAmount[0];
        int minIdMonth = 0;

        for (int i = 0; i < arrayOfAmount.length; i++) {
            if (arrayOfAmount[i] <= minAmount) {
                minAmount = arrayOfAmount[i];
                minIdMonth = i;
            }

        }

        System.out.println("Последний месяц c продажами на минимальную сумму: " + minIdMonth);

        return minIdMonth;
    }

    public int NumberOfMonthsBelowAverage(int[] arrayOfAmount) {

            // Нахождение количества месяцев с вырочкой ниже среднего
            int quantityMounth = 0;
            double AverageSalesAmountLocal=AverageSalesAmount(arrayOfAmount);

            for (int i = 0; i < arrayOfAmount.length; i++) {

                if (arrayOfAmount[i] < AverageSalesAmountLocal) {
                    quantityMounth=quantityMounth+1;
                }
            }

            System.out.println("Количество месяцев с вырочкой ниже среднего: " + quantityMounth);

            return quantityMounth;
        }
    public int NumberOfMonthsOverAverage(int[] arrayOfAmount){
            // Нахождение количества месяцев с вырочкой выше среднего
            int quantityMounth = 0;
        double AverageSalesAmountLocal=AverageSalesAmount(arrayOfAmount);

            for (int i = 1; i < arrayOfAmount.length; i++) {

                if (arrayOfAmount[i] > AverageSalesAmountLocal) {
                    quantityMounth = quantityMounth + 1;
                }
            }

            System.out.println("Количество месяцев с вырочкой выше среднего: " + quantityMounth);

            return quantityMounth;
        }
}