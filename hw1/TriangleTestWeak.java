package hw1;
import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTestWeak {

	
	@Test
	public void testCheck() {
		//only need to check a, b, c in the range
		/*Triangle tester1 = new Triangle(-1, 1, 1);
		assertEquals("Value of a is not in the range of permitted values",
				tester1.check());

		Triangle tester2 = new Triangle(1, -1, 1);
		assertEquals("Value of b is not in the range of permitted values",
				tester2.check());

		Triangle tester3 = new Triangle(1, 1, -1);
		assertEquals("Value of c is not in the range of permitted values",
				tester3.check());*/

		Triangle tester4 = new Triangle(1, 1, 1);
		assertEquals("It is an Equilateral Triangle!", tester4.check());

		Triangle tester5 = new Triangle(2, 2, 3);
		assertEquals("It is a Isosceles Triangle!", tester5.check());

		Triangle tester6 = new Triangle(4, 2, 3);
		assertEquals("It is a Scalene Triangle!", tester6.check());

		Triangle tester7 = new Triangle(2, 1, 4);
		assertEquals("It is NOT a Triangle!", tester7.check());

	}

}
