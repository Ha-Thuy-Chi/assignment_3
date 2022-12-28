package CreateOrder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Product {
    private String productId;
    private String title;
    private double price;
    private String category;

    public Product(String productId, String title, double price, String category) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }

    public ArrayList createPriceList() throws FileNotFoundException {
        String id, title, category;
        double price;
        FileReader file = new FileReader("src/items.txt");
        Scanner fileScanner = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        ArrayList <Double> priceList = new ArrayList<Double>();
        while (fileScanner.hasNext()) {
            String[] split = fileScanner.nextLine().split(",");
            price = Double.parseDouble(split[2]);
            priceList.add(price);
        }
        return priceList;
    }

    public ArrayList createProductList() throws FileNotFoundException {
        String id, title, category;
        double price;
        FileReader file = new FileReader("src/items.txt");
        Scanner fileScanner = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        ArrayList <SortProduct.Product> productList = new ArrayList<SortProduct.Product>();
        while (fileScanner.hasNext()) {
            StringTokenizer inReader = new StringTokenizer(fileScanner.nextLine(), ",");
            id = inReader.nextToken();
            title = inReader.nextToken();
            price = Double.parseDouble(inReader.nextToken());
            category = inReader.nextToken();
            productList.add(new SortProduct.Product(id, title, price, category));
        }
        return productList;
    }

    public String toString() {
        return String.format("%-15s%-30s%-10.2f%-5s\n",
                this.productId, this.title, this.price, this.category);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
