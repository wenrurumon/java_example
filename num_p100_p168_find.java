
class X{
	int x;
	int x2;
	int x3;
	public void init(int x_){
		x = x_;
		x2 = x+100;
		x3 = x2+168;
	}
	public int check(){
		int out;
		out = (Math.sqrt(x2)%1 + Math.sqrt(x3)%1) == 0 ? 1 : 0;
		return out;
	}
}

public class num_p100_p168_find{
	public static void main(String[] args){
		for(int i = 0; i<1000; i++){
			X x = new X();
			x.init(i);
			if(x.check()==1){
				System.out.println(i + " " + x.check());
			}
		}
	}
}
