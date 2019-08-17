package Practice;

public class Integer {

    public void sumOfVariables (int verbalScore, int mathScore) {
        int addition = verbalScore + mathScore;
        System.out.println(addition);
    }

    public static void main(String[] args) {
        Integer integer= new Integer();
        integer.sumOfVariables(25,10);

    }
}
