package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int amountSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return (int) sum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

//    public String arrayAllMonth(long[] sales) {
//        return Arrays.toString(sales);
//    }

    public float meanSales(long[] sales) {
        float mean = amountSales(sales) / sales.length;
        return mean;
    }

    public int lessSales(long[] sales) {
        int lessMeanSales = 0;
        for (long sale : sales) {
            if (sale < meanSales(sales)) {
                lessMeanSales = lessMeanSales + 1;
            }

        }
        return lessMeanSales;
    }

    public int moreSales(long[] sales) {
        int moreMeanSales = 0;
        for (long sale : sales) {
            if (sale > meanSales(sales)) {
                moreMeanSales = moreMeanSales + 1;
            }

        }
        return moreMeanSales;
    }
}




