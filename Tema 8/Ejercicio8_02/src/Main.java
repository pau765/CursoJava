import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        HoraExacta r = new HoraExacta (11, 15, 23);
        System.out.println(r);
        for (int i = 1; i <= 61; i++){
            r.inc();  
        }
      System.out.print(r);
      System.out.print("Escriba los segundos:  ");
      int segundos = new Scanner(System.in).nextInt();
      if (r.setSegundos (segundos)) {
        System.out.println(r);
      } else {
        System.out.print("No es posible cambiar los segundos.");
      }
    }
    

}
