import java.util.Scanner;

class printer{
	public void printer(int x){
		System.out.println(x);
	}
}

public class string_count{
	public static void main(String[] args){
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		printer p = new printer();
		Scanner input = new Scanner(System.in);
		System.out.println("input string: ");
		String s = input.nextLine();
		char[] ch = s.toCharArray();
		for(int i = 0; i<ch.length; i++){
			char chi = ch[i];
			//System.out.println(i + ", " + chi);
			if(Character.isLetter(chi)){
				count1 ++;
			} else if(Character.isDigit(chi)){
				count2 ++;
			} else if(Character.isSpaceChar(chi)){
				count3 ++;
			} else {
				count4 ++;
			}
		}
		p.printer(count1);
		p.printer(count2);
		p.printer(count3);
		p.printer(count4);
	}
}
