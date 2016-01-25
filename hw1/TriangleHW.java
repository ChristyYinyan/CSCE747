package hw1;
/*Verify whether it is a triangle, if yes, what kind of triangle it is 
 * Yinyan He */
import java.util.Scanner;

public class TriangleHW {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a's value: ");
		int a = sc.nextInt();

		System.out.println("Type in b's value: ");
		int b = sc.nextInt();

		System.out.println("Type in c's value: ");
		int c = sc.nextInt();

		Triangle trg = new Triangle(a, b, c);
		trg.check();
		System.out.println(trg);

	}
}
