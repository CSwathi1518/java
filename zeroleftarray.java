import java.util.*;
public class zeroleftarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]!=0){
                System.out.print(arr[i]+" ");
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
