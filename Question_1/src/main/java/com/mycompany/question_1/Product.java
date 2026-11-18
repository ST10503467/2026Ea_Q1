package com.mycompany.question_1;

public class Product implements IProducts {

    @Override
    public int GetTotalProductsSold(int[][] Product) {
        int TotalProductsSold = 0;
        for (int i = 0; i < Product.length; i++) {
            for (int j = 0; j < Product[i].length; j++) {
                TotalProductsSold += Product[i][j];
            }
        }
        return TotalProductsSold;
    }

    @Override
    public double GetAverageProductSold(int[][] Product) {
        double AverageProductsSold = 0;
        int ProductsSoldAmount = 0;
        double TotalProductsSoldAvgCalculation = 0;
        for (int i = 0; i < Product.length; i++) {
            for (int j = 0; j < Product[i].length; j++) {
                ProductsSoldAmount += 1;
                TotalProductsSoldAvgCalculation += Product[i][j];
            }
        }
        AverageProductsSold = TotalProductsSoldAvgCalculation / ProductsSoldAmount;
        return AverageProductsSold;
    }

    @Override
    public String GetMostPopularProduct(int[] TotalSales) {
        String MostPopularProduct;
        if (TotalSales[0] >= TotalSales[1] && TotalSales[0] >= TotalSales[2]) {
            MostPopularProduct = "Cozy Nights Monarch";
        } else if (TotalSales[1] >= TotalSales[0] && TotalSales[1] >= TotalSales[2]) {
            MostPopularProduct = "Restonic Barbados";
        } else {
            MostPopularProduct = "Sealy Phuket";
        }
        return MostPopularProduct;
    }

}
