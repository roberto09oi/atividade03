import java.util.Scanner;

public class LeitordeValor {
    public static void main(String[] args) {
        // Declarar um vetor de inteiros com 3 posições
        int[] valores = new int[3];

        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário que insira três números
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Insira o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        // Exibir os valores inseridos
        System.out.println("\nValores inseridos:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
        }

        // Calcular e exibir a média dos valores
        int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
        double media = (double) soma / valores.length;
        System.out.println("\nMédia dos valores: " + media);

        // Fechar o objeto Scanner
        scanner.close();
    }
}