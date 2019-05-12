//This program halves a given even number using recursion

public class Half {

		public static void main(String[] args) {
			int n = 250;
			if(n % 2 != 0) // n should be even to be halved
				return;
			System.out.print("The half of " + n + " is : ");
			System.out.println(halving(n));
		}
		
		public static int halving(int n) {
			if(n == 0)
				return 0; //Base case
			//Remove two and halve it (which gives one)
			//Halve what's left
			return 1 + halving(n - 2); //Recursive case
		}
	}
