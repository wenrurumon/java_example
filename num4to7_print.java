
import java.util.Scanner;

class Num{
	long value;
	int len;
	public Num(long x){
		this.value = x;
		this.len = Long.toString(x).toCharArray().length;
	}
}

class Input{
	long value;
	public Input(){
		Scanner s = new Scanner(System.in);
		System.out.println("input");
		value = s.nextLong();
	}
}

class Printer{
	public void print(long x){
		System.out.println(x);
	}
}

public class num4to7_print{
	public static void main(String[] args){
		Input input = new Input();
		Printer printer = new Printer();
		long x = input.value;
		long x2 = x/1000;
		long x3 = x2%10000;
		printer.print(x3);
	}
}
