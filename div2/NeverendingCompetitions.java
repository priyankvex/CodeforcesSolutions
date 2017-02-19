import java.util.Scanner;

/**
 * Created by priyank on 19/2/17.
 */
public class NeverendingCompetitions {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 2 == 0){
            System.out.println("home");
        }
        else{
            System.out.println("contest");
        }
    }
}

