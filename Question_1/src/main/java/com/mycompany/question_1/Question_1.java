package com.mycompany.question_1;

import java.util.Scanner;

public class Question_1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of sales for month 1 for Cozy Nights Monatch mattress: ");
        int CozyNightsMonarch1 = scanner.nextInt();
        System.out.println("Enter number of sales for month 2 for Cozy Nights Monatch mattress: ");
        int CozyNightsMonarch2 = scanner.nextInt();
        System.out.println("Enter number of sales for month 3 for Cozy Nights Monatch mattress: ");
        int CozyNightsMonarch3 = scanner.nextInt();
        int CozyNightsMonarchTotal = CozyNightsMonarch1 + CozyNightsMonarch2 + CozyNightsMonarch3;
        
        System.out.println("Enter number of sales for month 1 for Restonic Barbados mattress: ");
        int RestonicBarbados1 = scanner.nextInt();
        System.out.println("Enter number of sales for month 2 for Restonic Barbados mattress: ");
        int RestonicBarbados2 = scanner.nextInt();
        System.out.println("Enter number of sales for month 3 for Restonic Barbados mattress: ");
        int RestonicBarbados3 = scanner.nextInt();
        int RestonicBarbadosTotal = RestonicBarbados1 + RestonicBarbados2 + RestonicBarbados3;
        
        System.out.println("Enter number of sales for month 1 for Sealy Phuket mattress: ");
        int SealyPhuket1 = scanner.nextInt();
        System.out.println("Enter number of sales for month 2 for Sealy Phuket mattress: ");
        int SealyPhuket2 = scanner.nextInt();
        System.out.println("Enter number of sales for month 3 for Sealy Phuket mattress: ");
        int SealyPhuket3 = scanner.nextInt();
        int SealyPhuketTotal = SealyPhuket1 + SealyPhuket2 + SealyPhuket3;
        
        int[][] ProductSales = {
            {CozyNightsMonarch1, CozyNightsMonarch2, CozyNightsMonarch3},
            {RestonicBarbados1, RestonicBarbados2, RestonicBarbados3},
            {SealyPhuket1, SealyPhuket2, SealyPhuket3}
        };
        
        int[] TotalSales = {CozyNightsMonarchTotal, RestonicBarbadosTotal, SealyPhuketTotal};
        
        Product report = new Product();
        report.GetTotalProductsSold(ProductSales);
        report.GetAverageProductSold(ProductSales);
        report.GetMostPopularProduct(TotalSales);
        
        int TotalProductSold = report.GetTotalProductsSold(ProductSales);
        int AverageProductSold = (int) report.GetAverageProductSold(ProductSales);
        String MostPopularProduct = report.GetMostPopularProduct(TotalSales);
        
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("");
        System.out.println("********************************************");
        System.out.println("TOTAL PRODUCT SALES: " + TotalProductSold);
        System.out.println("AVERAGE PRODUCT SALES: " + AverageProductSold);
        System.out.println("MOST POPULAR PRODUCT: " + MostPopularProduct);
    }
}
 