
package com.mycompany.question_1;

public class Product implements IProducts {

    @Override
    public int GetTotalProductsSold(int [][] Product) {
        int TotalProductsSold = 0;
        for (int i = 0; i < Product.length; i++) {
            for (int j = 0; j < Product[i].length; j++) {
                TotalProductsSold += Product[i][j];
            }
        }
        return TotalProductsSold;
    }

    @Override
    public double GetAverageProductSold(int [][] Product) {
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
    public String GetMostPopularProduct(int [][] Product) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
