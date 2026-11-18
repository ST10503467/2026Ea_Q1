
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
    public double GetAverageProductSold() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String GetMostPopularProduct() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
