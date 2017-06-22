
import java.util.Scanner;

class Input{
	int[] x;
	int len;
	public Input(){
		Scanner s = new Scanner(System.in);
		int a[] = new int[100];
		int i = 0;
		do{
			System.out.println("input next int");
			a[i] = s.nextInt();
			i++;
		} while (a[i-1]!=-1);
		len = i;
		int[] x1 = new int[len-1];
		for(i = 0; i<len-1; i++){
			x1[i] = a[i];
		}
		x = x1;
		len--;
	}
}

class Printer{
	public void print(int[] x){
		for(int i = 0; i<x.length; i++){
			System.out.println(x[i]);
		}
	}
	public void print(int x){
		System.out.println(x);
	}
	public void rprint(int[] x){
		for(int i = 0; i<x.length; i++){
			System.out.println(x[x.length-i-1]);
		}
	}
	public void print(String x){
		System.out.println(x);
	}
}

public class reserve_print{
	public static void main(String[] args){
		Input input = new Input();
		Printer printer = new Printer();
		printer.print("Print x");
		printer.print(input.x);
		printer.print("rPrint x");
		printer.rprint(input.x);
	}
}
