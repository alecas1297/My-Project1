package Practice;

import java.util.Collections;

public class LoopsAlejandro {

    static String  psn = "PlayStation";
    static String joshua = "Camaro";
    static String alex = "Kia";
    static String luijo = "Mustang";


    public static void main(String[] args) {
        int alex = 5;
        for (int i = alex; alex < 20; alex++ )
        System.out.println(alex);
        checkCondition();

    }

    public static String checkCondition() {

        if (psn.equalsIgnoreCase(alex)) {
            return psn;

        } else if (joshua.equalsIgnoreCase(luijo)) {
            return joshua;

        } else if (psn. equalsIgnoreCase(joshua)) {
            return psn;

        } else{
            System.out.println("ninguno se comparan");
        }
            return alex;
    }
}
