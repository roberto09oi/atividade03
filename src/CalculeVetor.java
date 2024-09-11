public class CalculeVetor {
    public static void main(String[] args) {
        // Declarar um vetor de inteiros com 4 posições
        int[] vetor = new int[4];

        // Atribuir os valores 3, 6, 9, 12 ao vetor
        vetor[0] = 3;
        vetor[1] = 6;
        vetor[2] = 9;
        vetor[3] = 12;

        // Calcular a soma do primeiro e último elementos
        int soma = vetor[0] + vetor[3];

        // Exibir o resultado
        System.out.println("A soma do primeiro e último elementos do vetor é: " + soma);
    }
}
