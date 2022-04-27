package com.bkitsolution;

import java.util.HashMap;
import java.util.Map;

import static com.bkitsolution.ProductType.DIGITAL;
import static com.bkitsolution.ProductType.PHYSICAL;

public class Catalogue {
    public final static int SHIPPING_RATE = 5;

    private static Map<String, Product> productMap = Map.of(
            "Electric Toothbrush", new PhysicalProduct("Electric Toothbrush", 2550, 400),
            "Baby Alarm", new PhysicalProduct("Baby Alarm", 4000, 300),
            "War and Peace (e-book)", new DigitalProduct("War and Peace (e-book)", 1000)
    );

//    private static Map<String, Product> productMap = new HashMap<>();
//
//    static {
//        productMap.put("Electric Toothbrush", new Product("Electric Toothbrush", 3550));
//        productMap.put("Baby Alarm", new Product("Baby Alarm", 5000));
//        productMap.put("War and Peace (e-book)", new Product("War and Peace (e-book)", 1000));
//    }

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
