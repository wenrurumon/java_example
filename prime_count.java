public class prime_count{
	public static void main(String[] args){
		int b, cout=0;
		for(int i = 101; i<=200; i += 1){
			//for i 
			for(int j = 2; j<=Math.sqrt(i); j++){
				b = i % j;
				//System.out.println(i + " " + j + " " + b);
				if(b==0){
					cout += 1;
					break;
				}
			}
			System.out.println(i + " " + cout);
		}
	System.out.println(100 - cout);
	}
}
