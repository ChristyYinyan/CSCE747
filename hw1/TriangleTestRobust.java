package hw1;
import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTestRobust {

	@Test
	public void testCheck() {
		// test whether a is out of range
		Triangle tester1 = new Triangle(0, 1, 1);
		assertEquals("Value of a is not in the range of permitted values",
				tester1.check());

		Triangle tester1a = new Triangle(201, 1, 1);
		assertEquals("Value of a is not in the range of permitted values",
				tester1a.check());
		// Invalid case 1
		/*
		 * Triangle tester1c = new Triangle(1,1,1);
		 * assertEquals("Value of a is not in the range of permitted values"
		 * ,tester1c.check());
		 */
		// Invalid case 2
		/*
		 * Triangle tester1d = new Triangle(200,200,200);
		 * assertEquals("Value of a is not in the range of permitted values"
		 * ,tester1d.check());
		 */

		// test whether b is out of range
		Triangle tester2 = new Triangle(1, 0, 1);
		assertEquals("Value of b is not in the range of permitted values",
				tester2.check());

		Triangle tester2a = new Triangle(1, 201, 1);
		assertEquals("Value of b is not in the range of permitted values",
				tester2a.check());
		// Invalid case 1
		/*
		 * Triangle tester2b = new Triangle(1,1,1);
		 * assertEquals("Value of b is not in the range of permitted values"
		 * ,tester2b.check());
		 */
		// Invalid case 2
		/*
		 * Triangle tester2c = new Triangle(200,200,200);
		 * assertEquals("Value of b is not in the range of permitted values"
		 * ,tester2c.check());
		 */

		// Test whether c is out of range
		Triangle tester3 = new Triangle(1, 1, 0);
		assertEquals("Value of c is not in the range of permitted values",
				tester3.check());

		Triangle tester3a = new Triangle(1, 1, 201);
		assertEquals("Value of c is not in the range of permitted values",
				tester3a.check());
		// Invalid case 1
		/*
		 * Triangle tester3b = new Triangle(1,1,1);
		 * assertEquals("Value of c is not in the range of permitted values"
		 * ,tester3b.check());
		 */
		// Invalid case 2
		/*
		 * Triangle tester3c = new Triangle(200, 200, 200);
		 * assertEquals("Value of c is not in the range of permitted values"
		 * ,tester3c.check());
		 */

		// Test whether it is an Equilateral
		Triangle tester4 = new Triangle(1, 1, 1);
		assertEquals("It is an Equilateral Triangle!", tester4.check());
		// Invalid case 1
		/*
		 * Triangle tester4a = new Triangle(0, 0, 0);
		 * assertEquals("It is an Equilateral Triangle!", tester4a.check());
		 */
		Triangle tester4b = new Triangle(199, 199, 199);
		assertEquals("It is an Equilateral Triangle!", tester4b.check());

		Triangle tester4c = new Triangle(200, 200, 200);
		assertEquals("It is an Equilateral Triangle!", tester4c.check());

		Triangle tester4d = new Triangle(2, 2, 2);
		assertEquals("It is an Equilateral Triangle!", tester4d.check());
		// Invalid case 2
		/*
		 * Triangle tester4e = new Triangle(201, 201, 201);
		 * assertEquals("It is an Equilateral Triangle!", tester4e.check());
		 */

		// Test whether it is an Isosceles
		Triangle tester5 = new Triangle(2, 2, 3);
		assertEquals("It is a Isosceles Triangle!", tester5.check());
		// Invalid test case 1
		/*
		 * Triangle tester5a = new Triangle(201, 201, 2);
		 * assertEquals("It is a Isosceles Triangle!", tester5a.check());
		 */
		// Invalid case 2
		/*
		 * Triangle tester5b = new Triangle(0, 0, 1);
		 * assertEquals("It is a Isosceles Triangle!", tester5b.check());
		 */

		Triangle tester5c = new Triangle(199, 199, 2);
		assertEquals("It is a Isosceles Triangle!", tester5c.check());

		Triangle tester5d = new Triangle(200, 200, 2);
		assertEquals("It is a Isosceles Triangle!", tester5d.check());
		// Invalid case 3
		/*
		 * Triangle tester5e = new Triangle(1, 1, 2);
		 * assertEquals("It is a Isosceles Triangle!", tester5e.check());
		 */

		// Test whether it is an Scalene
		// Invalid case 1
		/*
		 * Triangle tester6 = new Triangle(1, 2, 3);
		 * assertEquals("It is a Scalene Triangle!", tester6.check());
		 */

		Triangle tester6a = new Triangle(200, 198, 3);
		assertEquals("It is a Scalene Triangle!", tester6a.check());
		// Invalid case 2
		/*
		 * Triangle tester6b = new Triangle(0, 1, 2);
		 * assertEquals("It is a Scalene Triangle!", tester6b.check());
		 */
		Triangle tester6c = new Triangle(199, 198, 2);
		assertEquals("It is a Scalene Triangle!", tester6c.check());

		Triangle tester6d = new Triangle(2, 3, 4);
		assertEquals("It is a Scalene Triangle!", tester6d.check());
		// Invalid case 3
		/*
		 * Triangle tester6e = new Triangle(201, 200, 2);
		 * assertEquals("It is a Scalene Triangle!", tester6e.check());
		 */

		// Test whether it is not a triangle
		Triangle tester7 = new Triangle(1, 1, 2);
		assertEquals("It is NOT a Triangle!", tester7.check());

		Triangle tester7a = new Triangle(200, 199, 1);
		assertEquals("It is NOT a Triangle!", tester7a.check());
		// Invalid case 1
		/*
		 * Triangle tester7b = new Triangle(0, 1, 2);
		 * assertEquals("It is NOT a Triangle!", tester7b.check());
		 */
		// Invalid case 2
		/*
		 * Triangle tester7c = new Triangle(201, 200, 2);
		 * assertEquals("It is NOT a Triangle!", tester7c.check());
		 */

	}

}
