package hw1;
import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTestEquiv {

	@Test
	public void testCheck() {
		// test whether a is out of range
		Triangle tester1a = new Triangle(0, 1, 1);
		assertEquals("Value of a is not in the range of permitted values",
				tester1a.check());

		Triangle tester1b = new Triangle(201, 1, 1);
		assertEquals("Value of a is not in the range of permitted values",
				tester1b.check());
		// Invalid case
		/*
		 * Triangle tester1c = new Triangle(2, 5, 4);
		 * assertEquals("Value of a is not in the range of permitted values",
		 * tester1c.check());
		 */

		
		// test whether b is out of range
		Triangle tester2a = new Triangle(1, 0, 1);
		assertEquals("Value of b is not in the range of permitted values",
				tester2a.check());

		Triangle tester2b = new Triangle(1, 201, 1);
		assertEquals("Value of b is not in the range of permitted values",
				tester2b.check());
		// Invalid case
		/*
		 * Triangle tester2c = new Triangle(2, 5, 4);
		 * assertEquals("Value of b is not in the range of permitted values",
		 * tester2c.check());
		 */

		
		// Test whether c is out of range
		Triangle tester3a = new Triangle(1, 1, 0);
		assertEquals("Value of c is not in the range of permitted values",
				tester3a.check());

		Triangle tester3b = new Triangle(1, 1, 201);
		assertEquals("Value of c is not in the range of permitted values",
				tester3b.check());
		// Invalid case

		/*
		 * Triangle tester3c = new Triangle(2,5,4);
		 * assertEquals("Value of c is not in the range of permitted values",
		 * tester3c.check());
		 */

		
		
		// Test whether it is an Equilateral
		Triangle tester4 = new Triangle(1, 1, 1);
		assertEquals("It is an Equilateral Triangle!", tester4.check());

		// Invalid case 1
		/*
		 * Triangle tester4a = new Triangle(-5, -5, -5);
		 * assertEquals("It is an Equilateral Triangle!", tester4a.check());
		 */

		// Invalid case 2
		/*
		 * Triangle tester4b = new Triangle(300, 300, 300);
		 * assertEquals("It is an Equilateral Triangle!", tester4b.check());
		 */
		
		

		// Test whether it is an Isosceles
		Triangle tester5 = new Triangle(2, 2, 3);
		assertEquals("It is a Isosceles Triangle!", tester5.check());

		// Invalid case 1
		/*
		 * Triangle tester5a = new Triangle(-5, -5, 3);
		 * assertEquals("It is a Isosceles Triangle!", tester5a.check());
		 */

		// Invalid case 2
		/*
		 * Triangle tester5b = new Triangle(2, 2, 3);
		 * assertEquals("It is a Isosceles Triangle!", tester5b.check());
		 */

		
		
		// Test whether it is an Scalene
		Triangle tester6 = new Triangle(4, 2, 3);
		assertEquals("It is a Scalene Triangle!", tester6.check());

		// Invalid case 1
		/*
		 * Triangle tester6a = new Triangle(-5, -4, -3);
		 * assertEquals("It is a Scalene Triangle!", tester6.check());
		 */

		// Invalid case 2
		/*
		 * Triangle tester6b = new Triangle(230, 450, 344);
		 * assertEquals("It is a Scalene Triangle!", tester6b.check());
		 */

		
		
		// Test whether it is not a triangle
		Triangle tester7 = new Triangle(2, 1, 4);
		assertEquals("It is NOT a Triangle!", tester7.check());

		// Invalid case
		/*
		 * Triangle tester7a = new Triangle(2, 3, 4);
		 * assertEquals("It is NOT a Triangle!", tester7a.check());
		 */

	}

}
