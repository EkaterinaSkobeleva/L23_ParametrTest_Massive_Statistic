package ru.netology.stats;

public class PeakMinSalesMonth {
    int calculate() {
        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //последний месяц c продажами на минимальную сумму
        int minAmount = arrayOfAmount[0];
        int minIdMonth=0;

        for (int i = 0; i < arrayOfAmount.length; i++) {
            if (arrayOfAmount[i] <= minAmount) {
                minAmount = arrayOfAmount[i];
                minIdMonth = i;
            }

        }


        System.out.println("Последний месяц c продажами на минимальную сумму: " + minIdMonth);

        return minIdMonth;
    }
}