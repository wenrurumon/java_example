
//给两个数字，求最大公约数及最小公倍数

import java.util.Scanner;

class min{
	public int min(int x, int y){
		int rlt = x>y ? y : x;
		return rlt;
	}
}

class max{
	public int max(int x, int y){
		int rlt = x>y ? x : y;
		return rlt;
	}
}

class div{
	public int div(int x, int y){
		int m1, m2, rlt=1;
		max M1 = new max();
		min M2 = new min();
		m1 = M1.max(x,y);
		m2 = M2.min(x,y);
		for(int i = m2; i >= 2; i--){
			if(m1%i + m2%i == 0){
				//System.out.println(i);
				rlt = i;
				break;
			}
		}
		return rlt;
	}
}

public class divisor_multiple{
	public static void main(String[] args){
		int rlt1, rlt2, x, y;
		Scanner s = new Scanner(System.in);
		System.out.println("input x");
		x = s.nextInt();
		System.out.println("input y");
		y = s.nextInt();
		div A = new div();
		rlt1 = A.div(x,y);
		System.out.println("Divisor: " + rlt1);
		rlt2 = x * y / rlt1;
		System.out.println("Multipler: " + rlt2);
	}
}

