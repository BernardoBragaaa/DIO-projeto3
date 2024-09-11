package app;

import java.util.Scanner;

import tools.PhoneCallFunction;
import tools.PhoneInternetFunction;
import tools.PhoneMusicasFunctions;

public class Prgram {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("1: Call Function");
        System.out.println("2: Internet Function");
        System.out.println("3: Musicas Function");
        System.out.println("4: parar aplicação");

        int num = sc.nextInt();
        int numMenu = 0;

        while (true) {
            switch (num) {
                case 1:
                    System.out.println("1: Atender o telefone.");
                    System.out.println("2: Pausar a musica.");
                    System.out.println("3: Selecionar musica.");
                    numMenu = sc.nextInt();
                    PhoneMusicasFunctions p1 = new PhoneMusicasFunctions(numMenu);
                    break;
                case 2:
                    System.out.println("1: Exibir a pagina");
                    System.out.println("2: Abrir nova aba");
                    System.out.println("3: Atualizar pagina");
                    numMenu = sc.nextInt();
                    PhoneInternetFunction p2 = new PhoneInternetFunction(numMenu);
                    break;
                case 3:
                    System.out.println("1: Ligar para alguem.");
                    System.out.println("2: Atender ligação.");
                    System.out.println("3: Escutar correio de voz.");
                    numMenu = sc.nextInt();
                    PhoneCallFunction p3 = new PhoneCallFunction(numMenu);

                    break;
                default:
                    System.out.println("Sistema incerrado");
                    System.exit(0);
                    break;
            }
            System.out.println("1: Call Function");
            System.out.println("2: Internet Function");
            System.out.println("3: Musicas Function");
            System.out.println("4: parar aplicação");
            num = sc.nextInt();
        }
    }
}
