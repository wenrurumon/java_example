class i{
	private int x;
	public i(int x_){
		x = x_;
	}
	public void p(){
		System.out.println(x);
	}
}

public class test{
	public static void main(String[] args){
		i x = new i(10);
		System.out.println(x);
		x.p();
	}
}
