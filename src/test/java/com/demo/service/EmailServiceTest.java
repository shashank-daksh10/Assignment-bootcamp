package com.demo.service;

import com.demo.domain.Order;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @BeforeClass
    public static void beforeclasstest(){
        System.out.println("beforeClass");
    }
    @Before
    public void beforetest(){
        System.out.println("before everyMethod");
    }


    @Test
    public void test_getInstance(){
        EmailService email = EmailService.getInstance();
        assertTrue(email instanceof EmailService);
    }

    @Test(expected = RuntimeException.class)
    public void sendEmailtest(){
        Order order= new Order(20,"Abhinav",77.9D);
        EmailService.getInstance().sendEmail(order);
    }

    @Test
    public void sendEmailtestWithParameter(){
        Order order = new Order(10,"shashank",10.4D);
        assertTrue(EmailService.getInstance().sendEmail(order,"daksh"));
    }

    @AfterClass
    public static void afterclasstest(){
        System.out.println("beforeClass");
    }
    @After
    public void Aftertest(){
        System.out.println("before everyMethod");
    }

}