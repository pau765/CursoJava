import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Hora r = new Hora (11, 30);
        System.out.print(r);
        for (int i = 1; i <= 61; i++) {
            r.inc();
        } 

        System.out.print(r);
        System.out.print("Escriba una hora: ");
        int hora = new Scanner (System.in).nextInt();
        boolean cambio = r.setHora(hora);
        if (cambio) {
            System.out.print(r);
        } else {
            System.out.println("la hora no se puede cambiar.");
        }
    }
}