package Ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Triangulo> triangulos = new ArrayList<>();

        int opcao;
        do {
            double a, b, c;
            boolean valido;

            // Verifica se os lados formam um triângulo válido
            do {
                System.out.println("\nDigite os lados do triângulo:");

                System.out.print("Lado a: ");
                a = entrada.nextDouble();

                System.out.print("Lado b: ");
                b = entrada.nextDouble();

                System.out.print("Lado c: ");
                c = entrada.nextDouble();

                valido = (a + b > c) && (a + c > b) && (b + c > a);

                if (!valido) {
                    System.out.println("Os valores inseridos não formam um triângulo. Tente novamente.");
                }
            } while (!valido);

            Triangulo triangulo = new Triangulo(a, b, c);
            triangulo.calcularCentroide();
            triangulos.add(triangulo);

            System.out.print("\nDeseja adicionar outro triângulo? (1 - Sim, 0 - Não): ");
            opcao = entrada.nextInt();
        } while (opcao == 1);

        // Exibir os resultados para todos os triângulos
        System.out.println("\n=== Resultados ===");
        for (int i = 0; i < triangulos.size(); i++) {
            Triangulo t = triangulos.get(i);
            System.out.println("\nTriângulo " + (i + 1) + ":");
            System.out.println("Área: " + t.calcularArea());
            System.out.println("Perímetro: " + t.calcularPerimetro());
            System.out.println("Centroide (x, y): (" + t.x + ", " + t.y + ")");
        }

        entrada.close();
    }
}