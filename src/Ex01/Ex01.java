package Ex01;
/*
 * Complexidade do método verificarRepetido():
 * O(n²) no pior caso, onde n é o tamanho da lista.
 * 
 * - O loop externo (i) executa n vezes.
 * - Para cada i, o loop interno (j) executa n - i - 1 vezes.
 * - Total de comparações: n(n-1)/2 → O(n²).
 * 
 * Melhor caso: O(1) (se o elemento repetido for encontrado nas primeiras comparações).
 * Pior caso: O(n²) (se não houver repetidos ou o repetido estiver no final).
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class Ex01 {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         ArrayList<Integer> lista = new ArrayList<>();
         int n;
 
         do {
             System.out.print("Informe o tamanho do array (n ≥ 2): ");
             n = in.nextInt();
             if (n < 2) {
                 System.out.println("Erro: O tamanho do array deve ser no mínimo 2.");
             }
         } while (n < 2);

         System.out.println("Informe os " + n + " números do array (valores entre 1 e " + (n - 1) + "):");
         for (int i = 0; i < n; i++) {
             int num;
             do {
                 System.out.print((i + 1) + "º número: ");
                 num = in.nextInt();
                 if (num < 1 || num > n - 1) {
                     System.out.println("Erro: O número deve estar no intervalo de 1 a " + (n - 1) + ". Digite novamente:");
                 }
             } while (num < 1 || num > n - 1);
             lista.add(num);
         }
 
         int repetido = verificarRepetido(lista);
 
         if (repetido != -1) {
             System.out.println("Número repetido = " + repetido);
         } else {
             System.out.println("Nenhum número repetido foi encontrado.");
         }
 
         in.close();
     }
 
     public static int verificarRepetido(ArrayList<Integer> lista) {
         for (int i = 0; i < lista.size(); i++) {
             for (int j = i + 1; j < lista.size(); j++) {
                 if (lista.get(i).equals(lista.get(j))) {
                     return lista.get(i); 
                 }
             }
         }
         return -1; 
     }
 }
 