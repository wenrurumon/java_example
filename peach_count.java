
class printer{
	public void print(int x){
		System.out.print(x + " ");
	}
	public void println(){
		System.out.println();
	}
}

public class peach_count{
	public static void main(String[] args){
		int x = 1;
		printer p = new printer();
		for(int i = 2; i<=10; i++){
			x = (x+1) * 2;
			p.print(i);
			p.print(x);
			p.println();
		}
	}
}
