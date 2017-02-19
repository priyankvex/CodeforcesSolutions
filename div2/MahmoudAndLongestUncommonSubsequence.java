import java.util.Scanner;

/**
 * Created by priyank on 19/2/17.
 */
public class MahmoudAndLongestUncommonSubsequence {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        if (s1.equals(s2)){
            System.out.println(-1);
        }
        else{
            System.out.println(Math.max(s1.length(), s2.length()));
        }
    }
}
