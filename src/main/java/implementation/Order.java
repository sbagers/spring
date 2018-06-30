package implementation;

import api.IOrder;
import api.IPizza;

public class Order implements IOrder
{
    private IPizza pizza;

    public Order(IPizza pizza)
    {
        this.pizza = pizza;
    }

    public void printOrder()
    {
        System.out.println(pizza.getName() + " " + pizza.getPrice());
    }

}