
import java.util.Scanner;

class date{
	private int year;
	private int month;
	private int day;
	private int date;
	private int[] daysinmonth = {31,28,31,30,31,30,31,31,30,31,30,31};

	public void init(int x){
		year = x/10000;
		month = x/100-year*100;
		day = x - year*10000 - month*100;
		if(year%400==0||(year%4==0 && year%100!=0)){
			daysinmonth[1] = 29;
		}
		//System.out.println(year+" "+month+" "+day);		
	}
	
	public int countday(){
		int temp = 0;
		for(int i = 1; i<month; i++){
			temp += daysinmonth[i-1];
		}
		temp += day;
		return temp;
	}
}

public class day_count{
	public static void main(String[] args){
		date x = new date();
		Scanner s = new Scanner(System.in);
		System.out.println("inpurt date");
		int date = s.nextInt();
		x.init(date);
		System.out.println(x.countday());
	}
}
