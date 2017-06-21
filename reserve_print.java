
import java.util.Scanner;

class printer{
	//private long x;
	public printer(){
	}
	public printer(long x){
		System.out.println(x);
	}
	public void printer(long x){
		System.out.println(x);
	}
	public void printer(char[] x){
		int len = x.length;
		for(int i = 0; i<len; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println();
		for(int i = 0; i<len; i++){
			System.out.print(x[len-i-1] + " ");
		}
		System.out.println();
	}
}

class input{
	private long x;
	public input(){
		Scanner s = new Scanner(System.in);
		System.out.println("input long");
		this.x = s.nextLong();
	}
	public void input(){
		Scanner s = new Scanner(System.in);
		System.out.println("input long");
		this.x = s.nextLong();
	}
	public long output(){
		return x;
	}
	public char[] tovec(){
		String s = Long.toString(x);
		char[] ch = s.toCharArray();
		return ch;
	}
}

public class reserve_print{
	public static void main(String[] args){
		input i = new input();
		printer p = new printer();
		char[] x = i.tovec();
		p.printer(x);
	}
}
