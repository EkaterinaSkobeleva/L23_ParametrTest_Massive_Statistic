package ru.netology.statistic;

public class PeakMaxSalesMonth{
        int calculate() {

            int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

            //последний месяц c продажами на максимальную сумму
            int maxMonth = arrayOfAmount[0];
            int maxIdMonth=0;

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
}
