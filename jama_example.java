
import Jama.*;

class Printer{
	public void print(Matrix x){
		x.print(5, 5);
	}
	public void print(double x){
		System.out.println(x);
	}
}

public class jama_example{
	public static void main(String[] args){
		Printer p = new Printer();
		double[][] x1 = {{1,2,3},{2.2,2.3,2.4},{3.1,3.5,4.2}};
		Matrix x = new Matrix(x1);
		p.print(x);
		Matrix x2 = x.inverse();
		p.print(x2);
		Matrix x3 = x.times(x2);
		p.print(x3);
		
		SingularValueDecomposition svd = new SingularValueDecomposition(x);
		p.print(svd.getU());
		p.print(svd.getS());
		p.print(svd.getV());
		p.print(svd.norm2());
	}
}
