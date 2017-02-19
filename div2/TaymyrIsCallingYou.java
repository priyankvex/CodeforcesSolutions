import java.util.Scanner;

/**
 * Created by priyank on 19/2/17.
 */
public class TaymyrIsCallingYou {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int z = in.nextInt();

        int gcd = findGCD(n, m);
        int lcm = (n*m)/gcd;

        int killed = z/lcm;

        System.out.println(killed);
    }

    private static int findGCD(int a, int b){

        if (a == b){
            return a;
        }

        if (a > b){
            return findGCD(a-b, b);
        }

        return findGCD(a, b-a);
    }
}

