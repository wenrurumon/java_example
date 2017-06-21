
class printer{
	public void printsp(int x){
		for(int i = 0; i<x; i++){
			System.out.print(" ");
		}		
	}
	public void printst(int x){
		for(int i = 0; i<x; i++){
			System.out.print("*");
		}
	}
	public void println(){
			System.out.println();
	}
}

public class diamond_plot{
	public static void main(String[] args){
		printer p = new printer();
		for(int i = 3; i >= 0; i--){
			p.printsp(i);
			p.printst((3-i)*2+1);
			p.println();
		}
		for(int i = 1; i <= 3; i++){
			p.printsp(i);
			p.printst((3-i)*2+1);
			p.println();
		}
	}
}
