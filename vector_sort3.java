
import java.util.Scanner;

class Printer{
	public void printsp(int x){
		for(int i = 0; i<x; i++){
			System.out.print(" ");
		}
	}
	public void print(int x){
		System.out.print(x);
	}
	public void print(int[] x){
		int len = x.length;
		for(int i = 0; i<len-1; i++){
			System.out.print(x[i]);
			System.out.print(", ");
		}
		System.out.println(x[len-1]);
	}
	public void println(){
		System.out.println();
	}
}

class Input{
	int[] value;
	public void input(){
		int[] a = new int[100];
		int i = 0;
		Scanner s = new Scanner(System.in);
		do{
			System.out.print("Input a"+i+": ");
			a[i] = s.nextInt();
			i++;
		} while (i<100&a[i-1]!=-1);
		int[] v = new int[i-1];
		for(int j = 0; j<i-1; j++){
			v[j] = a[j];
		}
		value = v;
	}
}

class Vec{
	int[] value;
	int[] order;
	int length;
	int min;
	int max;
	public Vec(int[] x){
		value = x;
		length = x.length;
		int[] o = new int[length];
		for(int i = 0; i<length; i++){
			for(int j = 0; j<length; j++){
				if(x[i]>x[j]){
					o[j]++;
				}
			}
		}
		order = o;
		for(int i = 0; i<length; i++){
			if(order[i]==0){
				max=x[i];
			} else if(order[i]==length-1){
				min=x[i];
			}
		}
	}
}

public class vector_sort3{
	public static void main(String[] args){
		Printer p = new Printer();
		Input x1 = new Input();
		//Input
		x1.input();
		p.print(x1.value);
		Vec x2 = new Vec(x1.value);
	}
}

