public class pinball_distance{
	public static void main(String[] args){
		double h = 100, s = 0;
		for(int i = 0; i <= 10; i++){
			//Down
			s += h;
			//Up
			h = h/2;
			s += h;
			//summary
			System.out.println(i+" "+h+" "+s);
		}
	}
}
