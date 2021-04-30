package ru.netology.stats;

public class SalesAmount {
    int calculate() {

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Сумма элементов массива
        int totalSumArray = 0;
        for (int i = 0; i < arrayOfAmount.length; i++) {
            totalSumArray += arrayOfAmount[i];
        }
        System.out.println("Сумма всех продаж: " + totalSumArray);

        return totalSumArray;
    }
}


