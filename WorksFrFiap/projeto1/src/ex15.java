import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os três valores
        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = scanner.nextInt();

        System.out.print("Digite o terceiro valor inteiro: ");
        int valor3 = scanner.nextInt();

        int menor, meio, maior;

        // Encontrando menor, meio e maior usando comparações
        if (valor1 <= valor2 && valor1 <= valor3) {
            menor = valor1;
            if (valor2 <= valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            menor = valor2;
            if (valor1 <= valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 <= valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }

        // Imprimindo em ordem crescente
        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);

        scanner.close();
    }
}