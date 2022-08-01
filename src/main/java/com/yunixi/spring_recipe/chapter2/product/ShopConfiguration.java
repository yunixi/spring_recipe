package com.yunixi.spring_recipe.chapter2.product;

import org.springframework.context.annotation.Bean;

public class ShopConfiguration {

    @Bean
    public Product batteryA() {
        Battery battery = new Battery("AA", 5000);
        battery.setRechargeable(true);
        return battery;
    }

    @Bean
    public Product discA() {
        Disc disc = new Disc("CD", 1500);
        disc.setCapacity(100);
        return disc;
    }
}
