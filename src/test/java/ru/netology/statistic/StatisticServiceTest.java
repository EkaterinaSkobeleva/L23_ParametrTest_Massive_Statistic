package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void salesAmount() {

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        StatisticService service = new StatisticService();

        // вызываем целевой метод:
        int actual = service.salesAmount(arrayOfAmount);

        //"Сумма всех продаж:
        //System.out.println(actual);

        assertEquals(expected, actual);
    }

    @Test
    void averageSalesAmount() {

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        StatisticService service = new StatisticService();

        double actual = service.averageSalesAmount(arrayOfAmount);
        //System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void peakMaxSalesMonth() {

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatisticService service = new StatisticService();

        int actual = service.peakMaxSalesMonth(arrayOfAmount);
        // System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void peakMinSalesMonth() {

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        StatisticService service = new StatisticService();

        int actual = service.peakMinSalesMonth(arrayOfAmount);
        //System.out.println(actual);
        assertEquals(expected, actual);
    }

    @Test
    void numberOfMonthsBelowAverage() {
        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatisticService service = new StatisticService();

        int actual = service.numberOfMonthsBelowAverage(arrayOfAmount);
        // System.out.println(actual);
        assertEquals(expected, actual);

    }

    @Test
    void numberOfMonthsOverAverage() {
        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatisticService service = new StatisticService();

        int actual = service.numberOfMonthsOverAverage(arrayOfAmount);
        //System.out.println(actual);
        assertEquals(expected, actual);

    }
}