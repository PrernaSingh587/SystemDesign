package com.company.Topping;

import com.company.Pizza.BasePizza;

public class Cheese implements BasePizza {

    BasePizza basePizza;

    public Cheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}
