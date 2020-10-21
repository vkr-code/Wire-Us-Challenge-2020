
import java.io.*; 
import java.util.*; 

class Day16{ 
	public static void findAllSequences(int diff, char out[],int start, int end) { 
		if (Math.abs(diff) > (end - start + 1) / 2) 
			return; 
		if (start > end) 	{ 
			if (diff == 0) 
			{ 
				System.out.print(out); 
				System.out.print(" "); 
			}	 
			return; 
		} 
		out[start] = '0'; 
		out[end] = '1'; 
		findAllSequences(diff + 1, out, start + 1, end - 1); 
		out[start] = out[end] = '1'; 
		findAllSequences(diff, out, start + 1, end - 1); 
		out[start] = out[end] = '0'; 
		findAllSequences(diff, out, start + 1, end - 1); 
		out[start] = '1'; 
		out[end] = '0'; 
		findAllSequences(diff - 1, out, start + 1, end - 1); 
	} 
	public static void main (String[] args) 
	{ 
		int n = s.nextInt(); 
		char[] out = new char[2 * n + 1]; 
		out[2 * n] = '\0'; 

		findAllSequences(0, out, 0, 2*n - 1); 
	} 
} 
