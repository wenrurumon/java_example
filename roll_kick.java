
import java.util.Scanner;

class Printer{
	public void print(int[] x){
		int len = x.length;
		for(int i = 0; i<len; i++){
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}
	public void print(int x){
		System.out.println(x);
	}
	public void print(Vec x){
		Printer p = new Printer();
		System.out.println("Vector:");
		p.print(x.value);
		System.out.println("Length:");
		p.print(x.length);
	}
}

class Vec{
	int[] value;
	int length;
	public Vec(){
		int[] x = new int[0];
		value = x;
		length = x.length;
	}
	public Vec(int[] x){
		value = x;
		length = x.length;
	}
	public Vec(int n){
		int[] x = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = i;
		}
		value = x;
		length = x.length;
	}
	public void extend(int n){
		int len = this.length + 1;
		int[] x = new int[len];
		for(int i = 0; i < this.length; i++){
			x[i] = value[i];
		} 
		x[this.length] = n;
		value = x;
		length = x.length;
	}
	public int roll(int r){
		Vec v = new Vec();
		r = r-1;
		for(int i = 0; i < this.length; i++){
			r++;
			if(r<3){
				v.extend(value[i]);
			} else {
				r = r-3;
			}
		}
		value = v.value;
		length = v.length;
		r++;
		return r;
	}
}

public class roll_kick{
	public static void main(String[] args){
		int n = 3;
		int i = 1;
		Printer p = new Printer();
		Vec v = new Vec(n);

		do{
			p.print(v);
			i = v.roll(i);
			System.out.println("Count:");
			p.print(i);	
			System.out.println("############");
		} while(v.length>1);

		p.print(v);
		i = v.roll(i);
		System.out.println("Count:");
		p.print(i);	
		System.out.println("############");
		
	}
}
