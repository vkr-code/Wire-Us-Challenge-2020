
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n--!=0){
			String str=s.next();
			Set<Character> st=new HashSet<>();
			for(int i=0;i<str.length();i++){
				if(!st.contains(str.charAt(i))){
					System.out.print(str.charAt(i));
					st.add(str.charAt(i));
				}
			}
			System.out.println();
		}
	}

}
