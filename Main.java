package com.bkitsolution;

import javax.sound.sampled.Line;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
//        Product toothbrush = new Product("Electric toothbrush", 3550);
//        Product babyAlarm = new Product("Baby Alarm", 4999);
        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
        Product warAndPeace = Catalogue.getProduct("War and Peace (e-book)");

        ShoppingCart cart = new ShoppingCart();
        cart.addLineItem(new LineItem(warAndPeace, 1));
        cart.addLineItem(new LineItem(babyAlarm, 1));
        LineItem toothbrushes = new LineItem(toothbrush, 2);
        cart.addLineItem(toothbrushes);
        System.out.println(cart.getTotalCost());

        Customer johnDoe = new Customer("John Doe", 5240793615183440L);
        Optional<Order> order = johnDoe.checkout(cart);
        System.out.println(order);

        order.ifPresent(Main::fulfil);
        System.out.println(order);

    }
    public static void fulfil(Order o) {
        ShoppingCart cart = o.getCart();
        boolean shippingUnfinished;
        do {
            shippingUnfinished = false;
            for (LineItem li : cart.getLineItems()) {
                boolean fulfilHalf = Math.random() > 0.7;
                if (fulfilHalf) {
                    li.setQuantity(li.getQuantity()/2);
                    shippingUnfinished = true;
                } else {
                    li.setQuantity(0);
                }
                System.out.println(fulfilHalf);
            }
        } while (shippingUnfinished);
    }
}
