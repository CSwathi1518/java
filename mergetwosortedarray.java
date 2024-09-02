import java.util.Scanner;

public class mergetwosortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] merged = new int[n + m];
        
        for (int i = 0; i < n; i++){
         arr1[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
        arr2[j] = sc.nextInt();
        }
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) merged[k++] = arr1[i++];
            else merged[k++] = arr2[j++];
        }

        while (i < n) {
            merged[k++] = arr1[i++];
        }
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        for (int num : merged) {
            System.out.print(num + " ");
        }       
        sc.close();
    }
}
