package Ex03;
import java.util.Scanner; 

 public class Ex03 {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         
         System.out.print("Digite o tamanho do array: ");
         int n = in.nextInt();
         int[] A = new int[n];
         
         System.out.println("Digite os elementos do array:");
         for (int i = 0; i < n; i++) {
             System.out.print("Elemento " + (i + 1) + ": ");
             A[i] = in.nextInt();
         }
         
         System.out.print("Digite o valor de k: ");
         int k = in.nextInt();
         
         reorganizarArray(A, k);
         
         System.out.print("Array reorganizado: ");
         for (int num : A) {
             System.out.print(num + " ");
         }
         
         in.close();
     }
     
     public static void reorganizarArray(int[] A, int k) {
         int pos = 0;
         for (int i = 0; i < A.length; i++) {
             if (A[i] <= k) {
                 int temp = A[i];
                 for (int j = i; j > pos; j--) {
                     A[j] = A[j - 1];
                 }
                 A[pos] = temp;
                 pos++;
             }
         }
     }
 }
 