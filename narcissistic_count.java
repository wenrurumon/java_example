public class narcissistic_count{
	public static void main(String[] args){
		int a, b, c, cout = 0;
		for(int i = 100; i<999; i++){
			c = i%10;
			b = (i%100 - c)/10;
			a = (i-b*10-c)/100;
			if(i==(a*a*a + b*b*b + c*c*c)){
				cout += 1;
				System.out.println(i);
			}
		}
		System.out.println(cout);
	}
}
