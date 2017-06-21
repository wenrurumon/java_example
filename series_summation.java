
class X{
	double m;
	double n;
	double x;
	public void init(double m_, double n_){
		m = m_;
		n = n_;
		x = m/n;
	}
	public void f5(){
		m = m+n;
		n = m-n;
		x = m/n;
	}
	public double print(){
		System.out.println("m="+m+",n="+n+",x="+x);
		return x;
	}
}

public class series_summation{
	public static void main(String[] args){
		double sum = 0;
		X x = new X();
		x.init(2,1);
		sum += x.print();
		System.out.println(sum);
		for(int i = 1; i<20; i++){
			x.f5();
			sum += x.print();
			System.out.println(sum);
		}
	}
}
