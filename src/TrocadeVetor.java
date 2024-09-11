public class TrocadeVetor {
    public static void main(String[] args) {
        // Declarar um vetor de inteiros com 2 posições
        int[] vetor = new int[2];

        // Atribuir os valores 5 e 10 ao vetor
        vetor[0] = 5;
        vetor[1] = 10;

        // Exibir os valores originais do vetor
        System.out.println("Valores originais do vetor:");
        System.out.println("Posição 0: " + vetor[0]);
        System.out.println("Posição 1: " + vetor[1]);

        // Trocar os valores entre as duas posições
        int temp = vetor[0];
        vetor[0] = vetor[1];
        vetor[1] = temp;

        // Exibir os valores trocados do vetor
        System.out.println("\nValores trocados do vetor:");
        System.out.println("Posição 0: " + vetor[0]);
        System.out.println("Posição 1: " + vetor[1]);
    }
}
