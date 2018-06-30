package implementation;

import api.IPizza;

public class GoodPizza implements IPizza
{
    private int price;
    private String name;

	public int getPrice()
	{
		return this.price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


    public GoodPizza(int price, String name)
    {
        this.price = price;
        this.name = name;
    }
}
