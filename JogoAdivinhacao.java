import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("🎯 Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("🔼 O número secreto é maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("🔽 O número secreto é menor!");
            } else {
                System.out.println("✅ Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSecreto);

        scanner.close();
    }
}
