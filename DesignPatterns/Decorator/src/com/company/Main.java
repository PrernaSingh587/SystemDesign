package com.company;

import com.company.Pizza.BasePizza;
import com.company.Pizza.Margerittha;
import com.company.Topping.Cheese;
import com.company.Topping.Mushroom;

public class Main {

    public static void main(String[] args) {
	 System.out.println("Decorator Design Pattern");
        BasePizza basePizza = new Mushroom(new Cheese(new Margerittha()));

        System.out.println("Price is " + basePizza.cost());
    }
}
