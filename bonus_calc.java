
import java.util.Scanner;

//给定销售业绩x，当x小于10，得到百分之10的bonus。当x大于10小于20，超出部分得7.5%。[20-40]:5%，[40,60]:3%，[60-100]:1.5%，[100,+inf]:1%
//设计程序给定某个业绩，输出其bonus

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
