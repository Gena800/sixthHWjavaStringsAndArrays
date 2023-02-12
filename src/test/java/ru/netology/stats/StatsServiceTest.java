package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    @Test
    public void findSum() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expectedSum = 180;
            int actualSum = service.amountSales(sales);
            Assertions.assertEquals(expectedSum, actualSum);
        }
    }

    @Test
    public void findMinMonth() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expectedSum = 9;
            int actualSum = service.minSales(sales);
            Assertions.assertEquals(expectedSum, actualSum);
        }
    }

    @Test
    public void findMaxMonth() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expectedSum = 8;
            int actualSum = service.maxSales(sales);
            Assertions.assertEquals(expectedSum, actualSum);
        }
    }

//    @Test
//    public void showArrayAllMonth() {
//        StatsService service = new StatsService();
//        {
//            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//            String expectedSum = "[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]";
//            String actualSum = service.arrayAllMonth(sales);
//            Assertions.assertEquals(expectedSum, actualSum);
//        }
//    }

    @Test
    public void findMeanSales() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expectedSum = 15;
            float actualSum = service.meanSales(sales);
            Assertions.assertEquals(expectedSum, actualSum);
        }
    }

    @Test
    public void findLessMeanSales() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expectedSum = 5;
            float actualSum = service.lessSales(sales);
            Assertions.assertEquals(expectedSum, actualSum);
        }
    }

    @Test
    public void findMoreMeanSales() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expectedSum = 5;
            float actualSum = service.moreSales(sales);
            Assertions.assertEquals(expectedSum, actualSum);
        }
    }


}