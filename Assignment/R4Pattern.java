import java.util.Scanner;
public class R4Pattern {
    public static void main(String []args )
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int st = 1;
        for (int i = 1; i <= n; i++)
        {
            for( int j = 1; j <= st; j++){

                System.out.print("*");
            }
            System.out.println();
            st++;
        }
    }
}
