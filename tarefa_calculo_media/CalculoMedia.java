import java.util.Scanner;

/**
 * Calcula a média aritmética de quatro notas e informa a situação do aluno.
 */
public class CalculoMedia {
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3, nota4);
        System.out.printf("A média das quatro notas é: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Aprovado de recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
