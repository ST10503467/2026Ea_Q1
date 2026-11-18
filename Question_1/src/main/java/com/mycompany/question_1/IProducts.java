
package com.mycompany.question_1;

public interface IProducts {
    int GetTotalProductsSold(int[][] Product);
    double GetAverageProductSold(int[][] Product);
    String GetMostPopularProduct(int[] TotalSales);
}