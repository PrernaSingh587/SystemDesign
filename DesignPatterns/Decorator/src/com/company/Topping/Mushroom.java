package com.company.Topping;

import com.company.Pizza.BasePizza;

public class Mushroom implements BasePizza {

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}
