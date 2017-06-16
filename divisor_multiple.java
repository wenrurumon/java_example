public class divisor_multiple{
	public static void main(String[] args){
		int m = 17*5, n = 17*6, out1, out2;
		//Minimal Covenant
		int min = m>n ? n : m;
		for(int i = 2; i <= min; i++){
			if( m%i+n%i == 0){
				System.out.println(i);
				break;
			}
		}
		//Maximum public multiple
		int max = m>n ? m : n;
		for(int i = max; i <= m*n; i++){
			if( i%m + i%n == 0){
				System.out.println(i);
				break;
			}
		}
	}
}
