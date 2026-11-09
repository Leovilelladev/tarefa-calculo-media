/**
 * Calcula a média aritmética de quatro notas fixas e exibe o resultado no console.
 */
public class CalculoMedia {
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static void main(String[] args) {
        double nota1 = 7.0;
        double nota2 = 8.0;
        double nota3 = 9.0;
        double nota4 = 10.0;

        double media = calcularMedia(nota1, nota2, nota3, nota4);
        System.out.printf("A média das quatro notas é: %.2f%n", media);
    }
}
