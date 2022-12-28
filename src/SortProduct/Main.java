package SortProduct;

import SortProduct.Product;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to sort items by price? (Yes/No)");
        if (sc.nextLine().charAt(0) == 'Y') {
            System.out.println("Ascending or Descending?");
            if (sc.nextLine().charAt(0) == 'A') {
                Product product = new Product();
                SortPrice sortPrice = new SortPrice();
                ArrayList<Double> priceList = sortPrice.sortAscending(product.createPriceList(), product .createProductList());
                System.out.printf("\n%-15s%-30s%-10s%-5s\n---------------------------------------------------------------\n",
                        "ID", "Title", "Price", "Category");
                for (int i = 0; i < priceList.size(); i++) {
                    System.out.println(priceList.get(i));
                }
                System.out.println("How about Descending? (Yes/No)");
                if (sc.nextLine().charAt(0) == 'Y') {
                    Product product2 = new Product();
                    SortPrice sortPrice2 = new SortPrice();
                    ArrayList<Double> priceList2 = sortPrice2.sortDescending(product2.createPriceList(), product2.createProductList());
                    System.out.printf("\n%-15s%-30s%-10s%-5s\n---------------------------------------------------------------\n",
                            "ID", "Title", "Price", "Category");
                    for (int i = 0; i < priceList2.size(); i++) {
                        System.out.println(priceList2.get(i));
                    }
                } else {System.out.println("Oh, Okay, Goodbye =((");}
            } else {
                Product product = new Product();
                SortPrice sortPrice = new SortPrice();
                ArrayList<Double> priceList = sortPrice.sortDescending(product.createPriceList(), product .createProductList());
                System.out.printf("\n%-15s%-30s%-10s%-5s\n---------------------------------------------------------------\n",
                        "ID", "Title", "Price", "Category");
                for (int i = 0; i < priceList.size(); i++) {
                    System.out.println(priceList.get(i));
                }
                System.out.println("How about Ascending? (Yes/No)");
                if (sc.nextLine().charAt(0) == 'Y') {
                    Product product2 = new Product();
                    SortPrice sortPrice2 = new SortPrice();
                    ArrayList<Double> priceList2 = sortPrice2.sortAscending(product2.createPriceList(), product2.createProductList());
                    System.out.printf("\n%-15s%-30s%-10s%-5s\n---------------------------------------------------------------\n",
                            "ID", "Title", "Price", "Category");
                    for (int i = 0; i < priceList2.size(); i++) {
                        System.out.println(priceList2.get(i));
                    }
                } else {System.out.println("Oh, Okay, Goodbye =((");}
            }
        } else {
            System.out.println("Oh, Okay, Goodbye =((");
        }
    }
}