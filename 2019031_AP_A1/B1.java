import java.util.*;
public class Q2 {
	public static String fun(String k) {
		StringBuilder t =new StringBuilder();
		int i = 0; int j = 1;
		if (k.length() == 1) {
			t.append(k);
			t.append(1);
			return t.toString();
		}
		while (i < k.length() && j < k.length()) {
			while (j < k.length() && k.charAt(i) == k.charAt(j)) {
				j += 1;
			}
			
			t.append(Character.toString(k.charAt(i)));
			t.append(Integer.toString(j - i));
			
			i = j; j += 1;
			if (j == k.length()) {
				t.append(Character.toString(k.charAt(i)));
				t.append(Integer.toString(j - i));
				return t.toString();
			}
		}
		
		return t.toString();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String k = scan.next();
		System.out.println(fun(k));
	}
}
