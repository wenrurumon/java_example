
import Jama.*;

class Printer{
	public void print(Matrix x){
		x.print(5,2);
	}
	public void print(double x){
		System.out.println(x);
	}
	public void printsvd(Matrix x_){
		SingularValueDecomposition x = new SingularValueDecomposition(x_);
		System.out.println("U");
		x.getU().print(5,2);
		System.out.println("V");
		x.getV().print(5,2);
		System.out.print("S");
		x.getS().print(5,2);
	}
}

public class jama_example{
	public static void main(String[] arg){
		Printer p = new Printer();
		double[][] x = {{1,2,3},{2,3,4},{3,5,5}};
		Matrix x1 = new Matrix(x);
		p.print(x1);
		p.printsvd(x1);
	}
}
