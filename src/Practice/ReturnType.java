package Practice;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReturnType {

    static boolean isLineFull = true;

    public static void main(String[] args) {
        System.out.println(myTicket);
    }

    public static void computadora() {

        String lenovo = "Think Pad";
        System.out.println(lenovo);
    }

    public static String computadorasa() {
        String apple = "Macbook Pro";
            return apple;
    }

    public static void fecha() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }

    public static int getTicket(){
        if (!isLineFull){
            return 11;
        }
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    static int myTicket = getTicket();

}


