
import java.util.Scanner;

public class score_rank{
	public static void main(String[] args){
		int x;
		String grade;
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		if(x>=90){
			grade = "A";
		} else if(x>=60) {
			grade = "B";
		} else {
			grade = "C";
		}
		System.out.println(grade);
		//char grade2 = x>=90 ? 'A' : x>=60 ? 'B' : 'C';
		String grade2 = x>=90 ? "A" : x>=60 ? "B" : "C";
		System.out.println(grade2);
	}
}
