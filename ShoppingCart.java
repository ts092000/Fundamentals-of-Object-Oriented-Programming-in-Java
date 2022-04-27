package com.bkitsolution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
//    private List<Product> products = new ArrayList<>();
    private List<LineItem> lineItems = new ArrayList<>();

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public List<LineItem> getLineItems() {
        return lineItems.stream()
                .map(LineItem::new)
                .collect(Collectors.toList());
    }

    public int getTotalCost() {
        return lineItems.stream()
                .mapToInt(LineItem::getPrice)
                .sum();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "lineItems=" + lineItems +
                '}';
    }

}
