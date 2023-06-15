import java.util.Scanner;
import java.util.Random;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int numero, resposta = generator.nextInt(100);
        char alternativa;

        System.out.println("Bem vindo ao jogo!");
        System.out.println("Voce sabe as regras? S/n");
        alternativa = scan.next().charAt(0);

        if (alternativa == 'S') {
            System.out.println("Otimo, continue com o jogo!");
        } else {
            System.out.println("A regra é simples, adivinhe o numero aleatório! Boa sorte!!");
        }


        do {
            System.out.printf("Digite um numero: ");
            numero = scan.nextInt();
            System.out.println("");
            if (numero == resposta) {
                System.out.println("Parabens, voce acertou!");
            }
            if (numero > resposta) {
                System.out.println("O numero certo é menor!");
            } else {
                System.out.println("O numero certo é maior! ");
            }
        } while (numero != resposta);

    }

}
