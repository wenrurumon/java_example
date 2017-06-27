import java.util.Scanner;

public class aaa_aggregate{
	public static void main(String[] args){
		int x,r,sum = 0, plus;
		Scanner s = new Scanner(System.in);
		System.out.println("Input num");
		x = s.nextInt();
		System.out.println("Input rep num");
		r = s.nextInt();
		plus = x;
		for(int i = 0; i<r; i++){
			sum += plus;
			System.out.println(sum);
			x = x*10;
			plus += x;
		}
		System.out.println(sum);
	}
}
