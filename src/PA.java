import java.util.Scanner;

/**
 * @author Arthur R. Martins
 * @version 1.0.0
 *
 * */

public class PA {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int a1, a2, an, r;

        System.out.print("Digite o primeiro termo a1: ");
        a1 = numero.nextInt();
        System.out.print("Digite o segundo termo a2: ");
        a2 = numero.nextInt();

        System.out.print("Termo desejado: ");
        an = numero.nextInt();
        r = a2 - a1;

        System.out.println("A razão da PA é: " + r);

        /**
         * an = a1 + (n - 1) . r
         * */

        an = a1 + (an - 1) * r;

        System.out.println("an = " + an);


    }
}
