package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        AverageSalesAmount serviceAverage = new AverageSalesAmount();
        NumberOfMonthsBelowAverage serviceNumberBelow = new NumberOfMonthsBelowAverage();
        NumberOfMonthsOverAverage serviceNumberOver = new NumberOfMonthsOverAverage();
        PeakMaxSalesMonth servicePeakMax = new PeakMaxSalesMonth();
        PeakMinSalesMonth servicePeakMin = new PeakMinSalesMonth();
        SalesAmount serviceSalesAmount = new SalesAmount();

        int SalesAmount = serviceSalesAmount.calculate();
        double AverageSalesAmount = serviceAverage.calculate();

        double numberOfMonthsOverAverage = serviceNumberOver.calculate(AverageSalesAmount);
        double numberOfMonthsBelowAverage = serviceNumberBelow.calculate(AverageSalesAmount);

        int peakMinSalesMonth = servicePeakMin.calculate();
        int peakMaxSalesMonth = servicePeakMax.calculate();
    }
}
