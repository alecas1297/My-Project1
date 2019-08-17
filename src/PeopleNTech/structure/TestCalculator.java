package PeopleNTech.structure;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.addition(10,20);
        System.out.println(result);
        cal.additionNDisplay(20,50);
        cal.additionNDisplay(20,50,100);
        cal.subtraction(10,20);

    }
}
