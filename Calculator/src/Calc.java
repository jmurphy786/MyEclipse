import java.util.ArrayList;

public class Calc {
	public static void main(String[] args) {
		String[] ops = {"*","/","+","-"};
		int[] input = {3,4,4,3};
		getcalc(input,ops);
		
		
	}
	

	public static void getcalc(int[] input, String[] ops) {
		ArrayList<Integer> storeadd = new ArrayList<Integer>();
		ArrayList<Integer> storediv = new ArrayList<Integer>();
		ArrayList<Integer> storemult = new ArrayList<Integer>();
		ArrayList<Integer> storesub = new ArrayList<Integer>();
		
		for (int i = 0 ; i<input.length ;i++) {
			for (int l = 0 ; l < ops.length ; l++) {
			for (int j = i+1 ; j<input.length ; j++) {
				if (l == 0) 
					storeadd.add(operations(input[i],input[j],ops[l]));
				if (l == 1) 
					storediv.add(operations(input[i],input[j],ops[l]));
				if (l == 2) 
					storemult.add(operations(input[i],input[j],ops[l]));
				if (l == 3) 
					storesub.add(operations(input[i],input[j],ops[l]));
			}
				
		}	
	}
	
	}
	
	public static int operations(int a, int b, String ops) {
		if (ops == "+")
			return addt(a,b);
		if (ops == "/")
			return div(a,b);
		if (ops== "-")
			return sub(a,b);
		if (ops == "*")
			return mult(a,b);
		else
			return 0;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int addt(int i , int j) {
		int l = i + j;
		return l;
	}
	
	public static int mult(int i , int j) {
		int l = i * j;
		return l;
	}
	
	public static int sub(int i , int j) {
		int l = i - j;
		return l;
	}
	public static int sub2(int i , int j) {
		int l = j - i;
		return l;
	}
	public static int div(int i , int j) {
		int l = i/j;
		return l;
	}
	
	public static int div2(int i , int j) {
		int l = j/i;
		return l;
	}
}