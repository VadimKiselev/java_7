package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    public int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public StatsService service = new StatsService();


    @Test
    void totalSales() {
        int expected = 180;
        int actual = service.totalSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSalesInMonth() {
        int expected = 15;
        int actual = service.monthAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxSales() {
        int expected = 8;
        int actual = service.monthWithMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMinSales() {
        int expected = 9;
        int actual = service.monthWithMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateBelowAverage() {
        int expected = 5;
        int actual = service.monthsWhereSalesBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAboveAverage() {
        int expected = 5;
        int actual = service.monthsWhereSalesAboveAverage(sales);
        assertEquals(expected, actual);
    }
}