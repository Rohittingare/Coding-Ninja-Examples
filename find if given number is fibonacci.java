import java.util.Scanner;
public class FibonacciNumber {
	
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //number to be checked if fibonacci or not
    System.out.print(checkMember(N));
}
	
	public static boolean checkMember(int n){
				
        	int a = 0;
            int b = 1;
            if (n==a || n==b) return true;
            int c = a+b;
            while(c<=n)
            {
                if(c == n) return true;
                a = b;
                b = c;
                c = a + b;
            }
            return false;

	}
	



}

