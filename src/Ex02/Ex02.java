package Ex02;
/*
 * Complexidade do método verificarSoma():
 * O(n³) - O algoritmo possui três loops aninhados:
 * - O loop externo (i) itera n-2 vezes (O(n)).
 * - Para cada i, o loop médio (j) itera até i vezes (O(n)).
 * - Para cada j, o loop interno (k) itera até i-j-1 vezes (O(n)).
 * No pior caso, a complexidade total é O(n³).
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class Ex02 {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         
         System.out.print("Digite o tamanho do vetor: ");
         int n = in.nextInt();
         
         ArrayList<Integer> lista = new ArrayList<>();
         
         System.out.println("Digite os elementos do vetor:");
         for (int i = 0; i < n; i++) {
             System.out.print("Elemento " + (i + 1) + ": ");
             lista.add(in.nextInt());
         }
         
         if (verificarSoma(lista)) {
             System.out.println("Existe um elemento que é a soma de dois anteriores.");
         } else {
             System.out.println("Nenhum elemento é a soma de dois anteriores.");
         }
         
         in.close();
     }
     
     public static boolean verificarSoma(ArrayList<Integer> lista) {
         for (int i = 2; i < lista.size(); i++) {
             boolean encontrado = false;
             for (int j = 0; j < i; j++) {
                 for (int k = j + 1; k < i; k++) {
                     if (lista.get(i) == lista.get(j) + lista.get(k)) {
                         encontrado = true;
                         break;
                     }
                 }
                 if (encontrado) break;
             }
             if (encontrado) return true;
         }
         return false;
     }
 }
 