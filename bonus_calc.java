
import java.util.Scanner;

public class bonus_calc{
	public static void main(String[] args){
		double x, rlt=0, temp;
		double[] thres = {0,10,20,40,60,100};
		double[] rate = {0.1,0.075,0.05,0.03,0.015,0.01};

		Scanner s = new Scanner(System.in);
		System.out.println("Input $:");
		x = s.nextInt();

		for(int i=0;i<6;i++){
			if(x<=thres[i+1]){
				temp = (x-thres[i])*rate[i];
				rlt += temp;
				System.out.println(i+" "+thres[i]+" "+rate[i]+" "+temp+" "+rlt);
				break;
			} else {
				temp = (thres[i+1]-thres[i])*rate[i];
				rlt += temp;
				System.out.println(i+" "+thres[i]+" "+rate[i]+" "+temp+" "+rlt);
			}
		}
		System.out.println(rlt);
	}
}
