import java.math.BigInteger;
import java.util.*;
public class Thirdy {
	public static int fun(BigInteger a) {
		BigInteger l = a;
		int g = 0;
		
		for (BigInteger i = BigInteger.valueOf(2); i.compareTo(l) <= 0; i = i.add(BigInteger.valueOf(1))) {
	//		BigInteger tt = BigInteger.valueOf(i);
		//	System.out.println(i);
			while (a.mod(i)== BigInteger.ZERO) {
			//	System.out.println("I= " + i);
				g = 1;
				if (a.compareTo(i) != 0) {System.out.print(i + "*");}
				
				else {System.out.print(i);}
				a = a.divide(i);
			//	System.out.println("A: " + a);
				}
		}
		return g;
	}
	public static void main(String[] args) {
		
		String k = args[0];
		BigInteger s  = BigInteger.valueOf(k.length());
	//	System.out.println("Hii");
		int t = fun(s);
		if (t == 0) {
			System.out.println(s);
		}
		
		
	}

	
}
