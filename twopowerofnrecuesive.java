import java.util.*;
public class twopowerofnrecuesive {

    public static int powerOfTwo(int n) {
        if (n == 0) {  
            return 1;
        } else {
            return 2 * powerOfTwo(n - 1);  
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();  
        int result = powerOfTwo(n);
        System.out.println(result);
        sc.close();
    }
}
