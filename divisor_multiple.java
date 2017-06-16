
import java.util.Scanner;

public class divisor_multiple{
	public static void main(String[] args){
		int m, n, out1, out2;
		Scanner s = new Scanner(System.in);
		m = s.nextInt();
		n = s.nextInt();
		//Minimal Covenant
		int min = m>n ? n : m;
		for(int i = 2; i <= min; i++){
			if( m%i+n%i == 0){
				System.out.println(i);
				break;
			}
		}
		//Maximum public multiple
		int max = m>n ? m : n;
		for(int i = max; i <= m*n; i++){
			if( i%m + i%n == 0){
				System.out.println(i);
				break;
			}
		}
	}
}
