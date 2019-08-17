package PeopleNTech.Constructors;

public class House {
    String houseName;


    public House(){   // Default constructor

    }
    public House(String houseName) {
        this.houseName = houseName;
        System.out.println(houseName);
    }

    public void getHouseName() {
        System.out.println("White House");
    }
}
