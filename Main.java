package com.bkitsolution;

import javax.sound.sampled.Line;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        Product toothbrush = new Product("Electric toothbrush", 3550);
//        Product babyAlarm = new Product("Baby Alarm", 4999);
        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        Product babyAlarm = Catalogue.getProduct("Baby Alarm");
        Product warAndPeace = Catalogue.getProduct("War and Peace (e-book)");

        ShoppingCart cart = new ShoppingCart();
        cart.addLineItem(new LineItem(babyAlarm, 1));
        cart.addLineItem(new LineItem(warAndPeace, 1));
        LineItem toothbrushes = new LineItem(toothbrush, 2);
        cart.addLineItem(toothbrushes);
//        System.out.println(cart.getTotalCost());

        Customer johnDoe = new Customer("John Doe", 5240793615183440L);

        int totalShippingCost = cart.getLineItems().stream()
                .mapToInt(LineItem::calculateShippingCost)
                .sum();

        System.out.println("Total shipping cost: " + totalShippingCost);

        int totalCost = cart.getLineItems().stream()
                .mapToInt(LineItem::getPrice)
                .sum();

        System.out.println("Total cost: " + totalCost);


//        Customer acme = new BusinessCustomer("Acme Product", 5555443535352672L, LARGE);
//        Customer globex = new BusinessCustomer("Globex Corp", 4525224167886123L, LARGE);
//        Customer saveTheWorld = new NonprofitCustomer("Save The World", 532825123344024L);
//
//        List<Customer> customers = List.of(johnDoe, acme, globex, saveTheWorld);

        //count how many customers are on each discount rate
//        Map<Integer, Long> discountMap =
//                customers.stream()
//                .collect(Collectors.groupingBy(Customer::calculateDiscount, Collectors.counting()));
//
//        System.out.println(discountMap);
//
//        discountMap = new HashMap<>();
//        for (Customer customer : customers) {
//            discountMap.merge(customer.calculateDiscount(), 1L, Long::sum);
//        }
//        System.out.println(discountMap);
//
//        System.out.println(acme);

        // calculate the total shipping cost for the cart

//        Optional<Order> order = johnDoe.checkout(cart);
//        System.out.println(order);
//
//        order.ifPresent(Main::fulfil);
//        System.out.println(order);

    }
//    public static void fulfil(Order o) {
//        ShoppingCart cart = o.getCart();
//        boolean shippingUnfinished;
//        do {
//            shippingUnfinished = false;
//            for (LineItem li : cart.getLineItems()) {
//                boolean fulfilHalf = Math.random() > 0.7;
//                if (fulfilHalf) {
//                    li.setQuantity(li.getQuantity()/2);
//                    shippingUnfinished = true;
//                } else {
//                    li.setQuantity(0);
//                }
//                System.out.println(fulfilHalf);
//            }
//        } while (shippingUnfinished);
//    }
}
