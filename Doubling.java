//This program doubles a given number using recursion

public class Doubling {

	public static void main(String[] args) {
		int n = 250;
		System.out.print("The double of " + n + " is : ");
		System.out.println(doubNbr(n));
	}
	
	public static int doubNbr(int n) {
		if(n == 0)
			return 0; //Base case
		//Remove one and double it (which gives two)
		//Double what's left
		return 2 + doubNbr(n - 1); //Recursive case
	}
}
