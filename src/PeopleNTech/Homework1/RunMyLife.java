
package PeopleNTech.Homework1;

public class RunMyLife {

    public static void main(String[] args) {
        MyLife.nba();
        MyLife myLife = new MyLife();
        myLife.santiago();
        MyLife calculator = new MyLife();
        int aValue = calculator.multiplication(25,2);
        System.out.println(aValue);
        MyLife.tryArray();
        MyLife person1 = new MyLife();
        person1.name = "Alejandro Castillo";
        person1.age = 22;
        person1.speak();

    }
}
