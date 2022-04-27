package com.bkitsolution;

import static com.bkitsolution.Catalogue.SHIPPING_RATE;
import static com.bkitsolution.ProductType.PHYSICAL;

public abstract class Product {
    private final String name;
    private int price;
    private int discount;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        int shippingCost = calculateShippingCost();
        return Math.round((1 - discount) * price) + shippingCost;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return  "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                "}";
    }

    public abstract int calculateShippingCost();
}
