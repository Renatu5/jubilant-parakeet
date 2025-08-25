package com.example.project.bee1010;
import java.util.Locale;
import java.util.Scanner;

// import com.example.project.bee1010.SimpleCalculate;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        int quantity;
        float price;
        System.out.println("Insira o código do produto");
        id = sc.nextInt();
        System.out.println("Insira a quantidade do produto");
        quantity = sc.nextInt();
        System.out.println("Insira o preço do produto");
        price = sc.nextFloat();

        PackageData product1 = new PackageData(id, quantity, price);

        System.out.println("Insira o código do segundo produto");
        id = sc.nextInt();
        System.out.println("Insira a quantidade do segundo produto");
        quantity = sc.nextInt();
        System.out.println("Insira o preço do segundo produto");
        price = sc.nextFloat();        
        PackageData product2 = new PackageData(id, quantity, price);

        sc.close();

        SimpleCalculate total = new SimpleCalculate();
        System.out.println("VALOR A PAGAR: R$ " + total.calculatePrices(product1, product2));
 
    }
}