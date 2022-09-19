package ru.netology.stats;

public class StatsService {
    public int totalSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int monthAverageSales(int[] sales) {
        int sum = totalSales(sales);
        return sum / sales.length;
    }

    public int monthWithMaxSales(int[] sales) {
        int max = getMax(sales);
        int monthCount = 1;
        int monthMaxSales = 0;
        for (int sale : sales) {
            if (sale == max) {
                monthMaxSales = monthCount;
            }
            monthCount++;
        }
        return monthMaxSales;
    }

    public int getMax(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (max < sale) {
                max = sale;
            }
        }
        return max;
    }
    public int monthWithMinSales(int[] sales) {
        int min = getMin(sales);
        int monthCount = 1;
        int monthMinSales = 0;
        for (int sale : sales) {
            if (sale == min) {
                monthMinSales = monthCount;
            }
            monthCount++;
        }
        return monthMinSales;
    }

    public int getMin(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        return min;
    }

    public int monthsWhereSalesBelowAverage(int[] sales) {
        int average = monthAverageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if(sale > average) {
                count++;
            }

        }
        return count;
    }

    public int monthsWhereSalesAboveAverage(int[] sales) {
        int average = monthAverageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if(sale < average) {
                count++;
            }

        }
        return count;
    }
}