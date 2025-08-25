// Link do BeeCrowd - https://judge.beecrowd.com/en/problems/view/1010

package com.example.project.bee1010;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.example.project.bee1010.SimpleCalculate;
class SimpleCalculateTests{
    @Test
    @DisplayName("teste 1 - Total a pagar - 15.50")
    void totalProductsPrices01(){
        PackageData p1 = new PackageData(12, 1, (float) 5.30);
        PackageData p2 = new PackageData(16, 2, (float) 5.10);
        SimpleCalculate total = new SimpleCalculate();
        assertEquals(15.50,total.calculatePrices(p1, p2), "VALOR A PAGAR: R$ 15.50");
    }   
   @Test
    @DisplayName("teste 2 - Total a Pagar - 51.40")
    void totalProductsPrices02 (){
        PackageData p1 = new PackageData(13, 2, (float) 15.30);
        PackageData p2 = new PackageData(161, 4, (float) 5.20);
        SimpleCalculate total = new SimpleCalculate();
        assertEquals(51.40,total.calculatePrices(p1, p2), "You need pay 51.40");
    }   
    @Test
    @DisplayName("teste 3 - Total a Pagar - 30.20")
    void totalProductsPrices03 (){
        PackageData p1 = new PackageData(1, 1, (float) 15.10);
        PackageData p2 = new PackageData(2, 1, (float) 15.10);
        SimpleCalculate total = new SimpleCalculate();
        assertEquals(30.20,total.calculatePrices(p1, p2), "You need pay 30.20");
    }   
}