package PeopleNTech.structure;

public class Calculator {


    public int addition(int num1, int num2) {
        int total = 0;
        total = num1 + num2;
        return total;
    }

    public void additionNDisplay(int num1, int num2) {
        int total = 0;
        total = num1 + num2;
        System.out.println(total);

    }

    public void additionNDisplay(int num1, int num2, int num3) {
        int total = 0;
        total = num1 + num2 + num3;
        System.out.println(total);
    }
    public void subtraction (int num1,int num2) {
        int total = 0;
        total = num1 - num2;
        System.out.println(total);

    }
}
