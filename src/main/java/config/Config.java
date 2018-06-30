package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import implementation.*;
import api.*;

@Configuration
public class Config
{
    @Bean
    public IPizza pizza()
    {
        return new GoodPizza(15,"Dobra");
    }

    @Bean
    public IOrder order(IPizza pizza)
    {
        return new Order(pizza);
    }
}