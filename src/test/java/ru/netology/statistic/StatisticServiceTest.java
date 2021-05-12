package ru.netology.statistic;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @org.junit.jupiter.api.Test
    void salesAmount() {

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=180;
        StatisticService service=new StatisticService();

        // вызываем целевой метод:
        int actual = service.SalesAmount(arrayOfAmount);

        //"Сумма всех продаж:
        System.out.println(actual);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void AverageSalesAmount() {

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected=15;
        StatisticService service=new StatisticService();

        double actual= service.AverageSalesAmount(arrayOfAmount);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void PeakMaxSalesMonth(){

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=5;
        StatisticService service=new StatisticService();

        int actual= service.PeakMaxSalesMonth(arrayOfAmount);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void PeakMinSalesMonth(){

        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=8;
        StatisticService service=new StatisticService();

        int actual= service.PeakMinSalesMonth(arrayOfAmount);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void NumberOfMonthsBelowAverage(){
        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=5;
        StatisticService service=new StatisticService();

        int actual= service.NumberOfMonthsBelowAverage(arrayOfAmount);
        System.out.println(actual);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void NumberOfMonthsOverAverage(){
        int[] arrayOfAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=5;
        StatisticService service=new StatisticService();

        int actual= service.NumberOfMonthsOverAverage(arrayOfAmount);
        System.out.println(actual);
        assertEquals(expected, actual);

    }
}