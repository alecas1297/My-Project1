package PeopleNTech.mypractice1;


import java.util.List;

public class Methods2 {

    public static void main(String[] args) {
        for (String animal : animales){
            System.out.println(animal);
        }

        for (int valor : valores) {
            System.out.println(valor);
        }
    }

    static  String [] animales = {"Leon", "Gato", "Perro", "Tigre"};
    static int [] valores = {55, 65, 75, 85, 95, 2,105};

    public static void printPerro() {
        System.out.println(animales[2]);
    }
}
