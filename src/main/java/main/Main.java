package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import api.IOrder;
import api.IPizza;
import implementation.GoodPizza;
import implementation.Order;
import config.Config;


public class Main
{
    public static void main(String args[])
    {
        System.out.println("Spring!");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        IOrder order = (IOrder)context.getBean("order");

        order.printOrder();

    }

}