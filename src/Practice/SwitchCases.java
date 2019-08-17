package Practice;

public class SwitchCases {

    public SwitchCases(){}

    public SwitchCases(String diaDeLaSemana){
        diaDeSemana(diaDeLaSemana);
    }

    public static void main(String[] args) {

    }

    public  void diaDeSemana(String diaDeLaSemana){
        String dia = diaDeLaSemana;
        switch(dia){
            case "lunes":
                System.out.println("Gym");
                break;
            case "martes":
                System.out.println("Mercado");
                break;
            case "miercoles":
                System.out.println("Lunch");
                break;
            case "jueves":
                System.out.println("Libre");
                break;
            case "viernes":
                System.out.println("Cobro");
                break;
        }
    }
}
