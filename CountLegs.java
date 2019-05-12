
//This program counts the number of sheep's legs using recursion, for a given number of sheep 
//(knowing that every sheep has four legs !)

public class CountLegs {
	
	public static void main(String[] args) {
		int n = 100;
		System.out.print("The number of legs of " + n + " sheep is : ");
		System.out.println(count(n));
	}
	
	public static int count(int n) {
		if(n == 0) //Base case
			return 0;
		return 4 + count(n - 1); //Recursive case	
	}
}
