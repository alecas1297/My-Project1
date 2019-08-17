package PeopleNTech.classNobject;

public class Pizza {
    // properties (STATE)
    public String pizzaType;
    public double price;
    public boolean isHaram;
    public boolean isDelicious;
    public char size;
    public String toppings;

    public Pizza () {
        this.pizzaType= "Pan Pizza";
        this.price = 10.99;
        this.isHaram = false;
        this.isDelicious = true;
        this.size = 'L';
        this.toppings = "Olives";
    }

    // Contructors
    public Pizza(String pizzaType, double price, boolean isHaram, boolean isDelicious, char size, String toppings) {
        this.pizzaType = pizzaType;
        this.price = price;
        this.isHaram = isHaram;
        this.isDelicious = isDelicious;
        this.size = size;
        this.toppings = toppings;
    }
    // methods (BEHAVIOR)
    public void receivePizzaOrder(char size, String toppings){
        System.out.println("Received order: " + size + " ," + toppings);
    }
    public void eatPizza () {
        System.out.println("Ate the pizza");
    }
}
