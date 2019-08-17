package Practice.PeopleNTech_Practice;

public class Car {
    // Properties of my car

    public String brand; // = "BMW";
    public String model; // = "M3";
    public int year; // = 2019;
    public double priceOfTheCar; // = 53499.99;
    public boolean isUsed; // = "Used";

    // Contructors

    public Car() {
        this.brand = "BMW";
        this.model = "M3";
        this.year = 2019;
        this.priceOfTheCar = 53499.99;
        this.isUsed = true;
    }

    public Car(String brand, String model, int year, double priceOfTheCar, String conditionOfTheCar) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.priceOfTheCar = priceOfTheCar;
        this.isUsed = isUsed;

    }

    // Method
    public void buyingMyCar (){
        System.out.println("I buy a: " + brand + " model: " + model + " made on the year: " + year + " the condition of the car is used: " + isUsed + " with a price of " + priceOfTheCar);
    }
}
