
import java.util.Scanner;
public class taboada {

	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int numero;

    numero = ler.nextInt();
    for (int contador = 1; contador <= 10; contador++) {
      System.out.print(numero + " X " + contador + " = ");
      System.out.println(contador * numero);
    }
    System.out.println(numero);
  }

}
