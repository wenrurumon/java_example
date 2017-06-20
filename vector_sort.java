
import java.util.Scanner;

class intput{
	public int input(){
		int value=0;
		Scanner s = new Scanner(System.in);
		value = s.nextInt();
		return value;
	}
}

class intvec{
	int[] vec;
	int[] rank;
	int[] sort;
	int len;
	public void init(){
		intput x = new intput();
		System.out.println("length of  the vector");
		len = x.input();
		vec = new int[len];
		for(int i = 0; i<len; i++){
			System.out.println("input "+i);
			vec[i] = x.input();
		}
		System.out.println("finished init");
		rank = new int[len];
		sort = new int[len];
	}
	public void rank(){
		for(int i = 0; i<len; i++){
			for(int j = 0; j<len; j++){
				if(vec[i]>vec[j]){
					rank[i] ++;
				}
			}
		}
	}
	public void print(){
		for(int i = 0; i<len; i++){
			//System.out.println(vec[i] + " " + rank[i]);
			sort[rank[i]] = vec[i];
		}
		for(int i = 0; i<len; i++){
			System.out.println(sort[i]);
		}
	}
}

public class vector_sort{
	public static void main(String[] args){
		intvec x = new intvec();
		x.init();
		x.rank();
		x.print();
	}
}
