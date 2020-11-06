import java.util.*;
public class LinkedList {
	public static void deleteNode(int[] arr, int on) {
		if (on == 0) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
			return ;
		}
		else {
			for (int i = 0; i < arr.length; i++) {
				if (i != on - 1) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println("");
			return ;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int u = 0; u < test; u++) {
			int a = scan.nextInt();
			int[] arr = new int[a];
			for (int i = 0; i < a; i++) {
				arr[i] = scan.nextInt();
			}
			int on = scan.nextInt();
			if (on == 0) {
				System.out.println("False");
				System.out.println(0);
				deleteNode(arr, on);
			}
			else {
				System.out.println("True");
				System.out.println(a - on + 1);
				deleteNode(arr , on);
			}
		}
	}
	
}
