package com.yunixi.spring_recipe.chapter2.product;

public class Battery extends Product {
    private boolean rechargeable;

    public Battery() {
        super();
    }

    public Battery(String name, double price) {
        super(name, price);
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }

    public boolean getRechargeable() {
        return this.rechargeable;
    }
}
