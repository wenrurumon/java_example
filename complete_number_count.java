class num{
	int x;
	int len;
	public void init(int x_){
		x = x_;
		len = String.valueOf(x).length();
	}
	public int factorsum(){
		int rlt = 0;
		for(int i = 1; i<=(x/2); i++){
			if(x%i==0){
				rlt += i;
			}
		}
		return rlt;
	}
	public int check(){
		if(x==1){
			return 1;
		} else {
			num a = new num();
			a.init(x);
			int out = a.factorsum() == x?1:0;
			return out;
		}
	}
}

public class complete_number_count{
	public static void main(String[] args){
		int rlt = 0;
		num A = new num();
		for(int i = 1; i <= 10000; i++){
			int out;
			A.init(i);
			out = A.check();
			rlt += out;
			if(out==1){
				System.out.println(i + " " + out + " " + rlt);
			}
		}
	}
}
