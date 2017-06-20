
class printer{
	public void print(int x){
		System.out.print(x + " ");
	}
	public void println(){
		System.out.println();
	}
}

public class multiplication{
	public static void main(String[] args){
		printer p = new printer();
		for(int i = 0; i<=9; i++){
			p.print(i);
			for(int j = 1; j<=9; j++){
				if(i==0){
					p.print(j);
				} else if(i>=j) {
					p.print(i*j);
				}
			}
			p.println();
		}
	}
}
