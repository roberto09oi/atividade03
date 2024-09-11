import java.util.Scanner;

public class LeitordeNomes {
    public static void main(String[] args) {
        // Declarar um vetor de strings com 3 posições
        String[] nomes = new String[3];

        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário que insira três nomes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Insira o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Exibir os nomes inseridos
        System.out.println("\nNomes inseridos:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }

        // Fechar o objeto Scanner
        scanner.close();
    }
}