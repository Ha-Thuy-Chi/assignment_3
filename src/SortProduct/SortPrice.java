package SortProduct;

import SortProduct.Product;

import java.util.ArrayList;
import java.util.Collections;

public class SortPrice extends Product {

    public SortPrice(String productId, String title, double price, String category) {
        super(productId, title, price, category);
    }
    public SortPrice() {

    }
    public ArrayList<String> sortAscending(ArrayList<Double> priceList, ArrayList<Product> productList) {
        ArrayList<String> sortedProductList = new ArrayList<>();
        Collections.sort(priceList);
        for (Double i : priceList) {
            for (Product product : productList) {
                if (product.getPrice() == i) {
                    sortedProductList.add(product.toString());
                }
            }
        }
        return sortedProductList;
    }

    public ArrayList<String> sortDescending(ArrayList<Double> priceList, ArrayList<Product> productList) {
        ArrayList<String> sortedProductList = new ArrayList<>();
        Collections.sort(priceList, Collections.reverseOrder());
        for (Double i : priceList) {
            for (Product product : productList) {
                if (product.getPrice() == i) {
                    sortedProductList.add(product.toString());
                }
            }
        }
        return sortedProductList;
    }
}
