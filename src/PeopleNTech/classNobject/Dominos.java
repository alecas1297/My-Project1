package PeopleNTech.classNobject;

import javax.swing.*;

public class Dominos {
    public static void main(String[] args) {
        Pizza alePizza = new Pizza();
        System.out.println(alePizza.pizzaType);
        System.out.println(alePizza.price);
        System.out.println(alePizza.isHaram);
        System.out.println(alePizza.isDelicious);
        System.out.println(alePizza.size);
        System.out.println(alePizza.toppings);

        System.out.println("____________");

        Pizza gabyPizza = new Pizza("Thin Crust", 12.99, false, true, 'L', "Hawaian");
        System.out.println(gabyPizza.pizzaType);
        System.out.println(gabyPizza.price);
        System.out.println(gabyPizza.isHaram);
        System.out.println(gabyPizza.isDelicious);
        System.out.println(gabyPizza.size);
        System.out.println(gabyPizza.toppings);





    }


}
