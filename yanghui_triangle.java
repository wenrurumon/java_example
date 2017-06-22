
class Yanghui{
	int[] value;
	public Yanghui(int[] x){
		int len = x.length;
		int[] x2 = new int[len+1];
		x2[0] = x[0];
		x2[len] = x[len-1];
		for(int i = 1; i < len; i++){
			x2[i] = (x[i-1]+x[i]);
		}
		value = x2;
	}
	public void update(){
		int[] x = value;
		int len = x.length;
		int[] x2 = new int[len+1];
		x2[0] = x[0];
		x2[len] = x[len-1];
		for(int i = 1; i < len; i++){
			x2[i] = (x[i-1]+x[i]);
		}
		value = x2;		
	}
}

class Printer{
	public void print(int x){
		if(x==0){
			System.out.print("   ");
		} else {
			int len = Integer.toString(x).toCharArray().length;
			for(int i = 0; i<(3-len); i++){
				System.out.print(" ");
			}
			System.out.print(x);
		}
	}
	public void printsp(int x){
		for(int i = 0; i<x; i++){
			System.out.print("   ");
		}
	}
	public void println(){
		System.out.println();
	}
	public void print(int[] x){
		int len = x.length;
		Printer p = new Printer();
		for(int i = 0; i < len; i++){
			p.print(x[i]);
			p.print(0);
		}
		p.println();
	}
}

public class yanghui_triangle{
	public static void main(String[] args){
		Printer p = new Printer();
		int[] x = {1};
		Yanghui y = new Yanghui(x);
		int len2go = 10;
		p.printsp(len2go-1);
		p.print(x);
		p.printsp(len2go-2);
		p.print(y.value);
		for(int i = 3; i<=len2go; i++){
			p.printsp(len2go-i);
			y.update();
			p.print(y.value);
		}
	}
}

