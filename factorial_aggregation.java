
//计算1!+2!+3!+...+n!, 1/1! + 1/2! + 1/3! + ... + 1/n!

class X{
	double x;
	public void init(double x_){
		x = x_;
	}
	public double xf(){
		double f = 1;
		for(double i = 1; i<=x; i++){
			f = f*i;
		}
		return f;
	}
}

public class factorial_aggregation{
	public static void main(String[] args){
		X x = new X();
		double sum1=0, sum2=0;
		for(double i = 1; i<=20; i++){
			x.init(i);
			double x1;
			x1 = x.xf();
			sum1 += x1;
			sum2 += 1/x1;
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
