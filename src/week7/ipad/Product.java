package week7.ipad;

public class Product {
    private ProductInterface type;


    public Product(ProductInterface type) {
        this.type = type;
    }


    public double computePrice() {
        return type.computePrice();
    }

    public String toString() {
        return type + " and costs $" + computePrice();
    }

}

