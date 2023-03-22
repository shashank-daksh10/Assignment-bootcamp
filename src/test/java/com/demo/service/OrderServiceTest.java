package com.demo.service;

import com.demo.domain.Order;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OrderServiceTest extends TestCase {




    @Test
    public void test_getInstance(){
        OrderService order = OrderService.getInstance();
        assertEquals(true,order instanceof OrderService);//instance of check whether object is created or not.
    }

    public void test_getInstanceFail(){
        OrderService order = OrderService.getInstance();
        assertEquals(false,order instanceof OrderService);//instance of check whether object is created or not.
    }
    public void testPlaceOrder() {
    }

    @Test
    public void testTestPlaceOrder() {
        Order order = new Order(10,"Shashank",20000D);
        assertEquals(true,OrderService.getInstance().placeOrder(order,"Check"));
    }

    @Test
    public void testTestPlaceOrdeFail() {
        Order order = new Order(10,"Shashank",20000D);
        assertEquals(false,OrderService.getInstance().placeOrder(order,"Check"));
    }
}