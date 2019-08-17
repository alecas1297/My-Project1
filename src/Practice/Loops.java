package Practice;

import java.util.LinkedList;
import java.util.List;

public class Loops {

    static int i = 0;
    //while
    //for
    //do while
    //for each
    public static void main(String[] args) {

        List<String> nombres =  new LinkedList<>();
        nombres.add("Luijo");
        nombres.add("Joshua");
        nombres.add("Alejandro");

        for (int a = 0; a < 10; a++){
            System.out.println(a);
        }

        while(i < 10) {
            System.out.println(i);
            i++;
        }

        do{
            System.out.println("Hello world!");
        }while(i > 10);
        i++;

        for (String name : nombres) {
            System.out.println(name);
        }

    }
}
