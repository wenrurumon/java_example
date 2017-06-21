
import java.util.Scanner;

class printer{
	public void print(int x){
		System.out.print(x);
	}
	public void printsp(){
		System.out.print(" ");
	}
	public void println(){
		System.out.println();
	}
	public void println(int x){
		System.out.println(x);
	}
}

class input{
	private int x;
	public input(){
		Scanner s = new Scanner(System.in);
		System.out.println("input int");
		this.x = s.nextInt();
	}
	public int value(){
		return x;
	}
	public int[] tovec(){
		String str = String.valueOf(x);
		char[] ch = str.toCharArray();
		int len = ch.length;
		int[] rlt = new int[len];
		for(int i=0; i<len; i++){
			rlt[i] = Character.getNumericValue(ch[i]);
		}
		return rlt;
	}
}

public class symmetry_test{
	public static void main(String[] args){
		printer p = new printer();
		input i = new input();
		int[] v = i.tovec();
		int len = v.length;
		boolean b = true;
		for(int j = 1; j<len; j++){
			if(v[j]!=v[len-1-j]){
				b = false;
			}
		}
		System.out.println(b);
	}
}
