import java.util.Scanner;
//输入数字x与重复次数y，计算形状x + xx + xxx ...的加和。如x=1,y=3 -> 计算1+11+111

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
