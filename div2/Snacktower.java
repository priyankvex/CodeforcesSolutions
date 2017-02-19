import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by priyank on 19/2/17.
 */
public class Snacktower {

    public static void main (String[] args){
        Scanner in  = new Scanner(System.in);

        int n = in.nextInt();

        int[] a = new int[n];
        int[] temp = new int[n+1];
        Arrays.fill(temp, 0);

        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        int level = n;

        for (int i = 0; i < n; i++){
            if (a[i] == level){
                System.out.print(a[i]);
                level--;
                for (int k = a[i] - 1; k > 0; k--){
                    if (temp[k] == 1){
                        System.out.print(" " + k);
                        level--;
                        temp[k] = 0;
                    }
                    else{
                        break;
                    }
                }
                System.out.print("\n");
            }
            else{
                temp[a[i]] = 1;
                System.out.print("\n");
            }
        }
    }
}
