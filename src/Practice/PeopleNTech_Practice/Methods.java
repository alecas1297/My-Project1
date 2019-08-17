package Practice.PeopleNTech_Practice;

import java.util.Scanner;

public class Methods {

    public int getSquaredAge(int age) {
        int squaredage = age * age;
        return squaredage;
    }
    public static void jobPosition(){
        System.out.println("QA Engineer");
    }
    public static void myPounds(){
        double pounds;
        double kilograms;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds");
        pounds = input.nextDouble();
        kilograms = pounds*0.454;
        System.out.println(pounds + "is" + kilograms + "kilograms" );
    }
    public double calculateSalaryWithRaise(double salary, double percentage) {
        double newSalary = salary + (salary*percentage);
        return newSalary;
    }



    public static void main(String[] args) {
        Methods methods = new Methods();
        int squaredage = methods.getSquaredAge(22);
        System.out.println(squaredage);
        Methods.jobPosition();
        Methods.myPounds();
        double newSalary = methods.calculateSalaryWithRaise(100000, 0.12);
        System.out.println(newSalary);


    }


}
