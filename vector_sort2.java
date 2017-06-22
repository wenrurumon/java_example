
import java.util.Scanner;

class Input{
	int x;
	public void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("input:");
		x = s.nextInt();
	}
	public int value(){
		return x;
	}
}

class Printer{
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
	public void print(int[] x){
		int len = x.length;
		for(int i = 0; i<len; i++){
			System.out.print(x[i]);
			if(i!=len-1){
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}

class Vector{
	int[] vec;
	public Vector(int[] vec){
		this.vec = vec;
	}
	public void Vector(int[] vec){
		this.vec = vec;
	}
	public int[] value(){
		return vec;
	}
	public int[] rank(){
		int len = vec.length;
		int[] rank = new int[len];
		for(int i=0; i<len; i++){
			for(int j=0; j<len; j++){
				if(vec[i]>vec[j]){
					rank[i]+=1;
				}
			}
		}
		return rank;
	}
}

public class vector_sort2{
	public static void main(String[] args){
		int len;
		Input input = new Input();
		Printer printer = new Printer();
		//input vector
		input.input();
		len = input.value();
		int[] vec = new int[len];
		for(int i = 0; i<len; i++){
			input.input();
			vec[i] = input.value();
		}
		//Vector Sort
		Vector v = new Vector(vec);
		int[] v_val = v.value();
		int[] v_order = v.rank();
		int[] v_sort = new int[len];
		for(int i = 0; i<len; i++){
			v_sort[v_order[i]] = v_val[i];
		}
		//printer.print(v_val);
		//printer.print(v_order);
		printer.print(v_sort);
		//Vector Insert
		input.input();
		int[] vec2 = new int[len+1];
		for(int i = 0; i<len; i++){
			vec2[i] = v_sort[i];
		}
		vec2[len] = input.value();
		Vector v2 = new Vector(vec2);
		//Vector2 Sort
		int[] v2_val = v2.value();
		int[] v2_order = v2.rank();
		int[] v2_sort = new int[len+1];
		for(int i = 0; i<=len; i++){
			v2_sort[v2_order[i]] = v2_val[i];
		}
		//printer.print(v2_val);
		//printer.print(v2_order);
		printer.print(v2_sort);
	}
}
