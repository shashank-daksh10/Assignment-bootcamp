package com.demo.service;

import com.demo.domain.Order;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OrderServiceTest extends TestCase {




    @Test
    public void test_getInstance(){
        OrderService order = OrderService.getInstance();
        assertTrue(order instanceof OrderService);//instance of check whether object is created or not.
    }
    public void testPlaceOrder() {
    }

    @Test
    public void testTestPlaceOrder() {
        Order order = new Order(10,"Shashank",20000D);
        assertTrue(OrderService.getInstance().placeOrder(order,"Check"));
    }
}