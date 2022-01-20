package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    }

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return (sum);
    }

    public int calculateAverageSale(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMaxSale(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int findBelowAverage(int[] sales) {
        double average = calculateAverageSale(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count = count + 1;
            }
        }
        return (count);
    }


    public int findAboveAverage(int[] sales) {
        double average = calculateAverageSale(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count = count + 1;
            }
        }
        return (count);
    }
}






