
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int soma1 = 0;
		int soma2 = 0;
		
		for(int i=1; i<=n;) {	
			
			int x = sc.nextInt();
			
			if (x >= 10.0 && x <= 20.0) {
				soma1 = soma1 + i;
				System.out.println(soma1 + " in");
			} else {
				soma2 = soma2 + i;
				System.out.println(soma2 + " out");
			}
			
		}
		
		sc.close();
	}

}
