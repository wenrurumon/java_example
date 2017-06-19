import java.util.Scanner;

public class string_count{
	public static void main(String[] args){
		int count1 = 0, count2 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("input string: ");
		String s = input.nextLine();
		char[] ch = s.toCharArray();
		//System.out.println(ch);
		for(int i = 0; i<ch.length; i++){
			char chi = ch[i];
			//System.out.println(i + ", " + chi);
			if(Character.isLetter(chi)){
				count1 ++;
			} else if(Character.isDigit(chi)){
				count2 ++;
			}
		}
		System.out.println("count1="+count1+" count2="+count2);
	}
}
