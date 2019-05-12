//Adapted from Algorithms in Java by Sedgewick,3rd ed, Parts 1-4, chapter 5, section 5.1
public class EvalExpr {
	static char[] a;
	static int i;
	static int prefixEval() {
	if (a[i] == '+'){i++; return prefixEval() + prefixEval();}
	if (a[i] == '-'){i++; return prefixEval() - prefixEval();}
	if (a[i] == '*'){i++; return prefixEval() * prefixEval();}
	if (a[i] == '/'){i++; return prefixEval() / prefixEval();}
	else
		return a[i++] - '0';
	}
	static int postfixEval() {
		if (a[i] == '+'){i++; return postfixEval() + postfixEval();}
		if (a[i] == '-'){i++; return -postfixEval() + postfixEval();}
		if (a[i] == '*'){i++; return postfixEval() * postfixEval();}
		if (a[i] == '/'){i++; return (int) (1.0/postfixEval() * postfixEval());}
		else
			return a[i++] - '0';	
	}
	public static void main(String[] args) {
		String s;
		//Some tests for prefix evaluation
		//s = "/93";
		//s = "*+5++19*762"; //[(1+9)+(7*6)+5]*2 = 114
		//s = "-+7*46+8/63"; //(7+4*6)-(8+6/3) = 21
		//Some tests for postfix evaluation
		//s = "314++05++"; //(3+(1+4))+(0+5) = 13
		//s = "231*+9-"; //(2+3*1)-9 = -4
		//s = "123+-7*2/"; //[(1-(2+3))*7]/2 = -14
		//s = "53+82-*"; //(5+3)*(8-2) = 48
		//s = "53+82-*63//"; //[(5+3)*(8-2)]/(6/3) = 24
		//s = "53+82-*6/2/"; //[((5+3)*(8-2))/6]/2 = 4
		//s = "82+35-*"; //(8+2)*(3-5) = -20
		s = "82+35-/"; //(8+2)/(3-5) = -5
		a = new char[s.length()];
		//For prefix evaluation, uncomment the next three lines
		/*for(int n = 0; n < s.length(); n++ )
		a[n] = s.charAt(n);
		System.out.println("eval = " + prefixEval());*/
		//For postfix evaluation, uncomment the next three lines
		/*for(int n = 0; n < s.length(); n++ )
			a[n] = s.charAt(s.length() - 1 - n);
		System.out.println("eval = " + postfixEval());*/
	}
}
