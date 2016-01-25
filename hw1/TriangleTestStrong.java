package hw1;
import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTestStrong {

	
	@Test
	public void testCheck() {
		//only need to check a, b, c in the range
		/*// test whether a is out of range
		Triangle tester1 = new Triangle(-1,1,1);
		assertEquals("Value of a is not in the range of permitted values",tester1.check());
		
		Triangle tester1a = new Triangle(-2,1,1);
		assertEquals("Value of a is not in the range of permitted values",tester1a.check());
		
		Triangle tester1b = new Triangle(-3,1,1);
		assertEquals("Value of a is not in the range of permitted values",tester1b.check());
		
		Triangle tester1c = new Triangle(202,1,1);
		assertEquals("Value of a is not in the range of permitted values",tester1c.check());
		
		Triangle tester1d = new Triangle(500,1,1);
		assertEquals("Value of a is not in the range of permitted values",tester1d.check());
		
		
		//test whether b is out of range
		Triangle tester2 = new Triangle(1,-1,1);
		assertEquals("Value of b is not in the range of permitted values",tester2.check());
		
		Triangle tester2a = new Triangle(1,-2,1);
		assertEquals("Value of b is not in the range of permitted values",tester2a.check());
		
		Triangle tester2b = new Triangle(1,-3,1);
		assertEquals("Value of b is not in the range of permitted values",tester2b.check());
		
		Triangle tester2c = new Triangle(1,202,1);
		assertEquals("Value of b is not in the range of permitted values",tester2c.check());
		
		Triangle tester2d = new Triangle(1,400,1);
		assertEquals("Value of b is not in the range of permitted values",tester2d.check());
		
		
		//Test whether c is out of range
		
		Triangle tester3 = new Triangle(1,1,-1);
		assertEquals("Value of c is not in the range of permitted values",tester3.check());
		
		Triangle tester3a = new Triangle(1,1,-2);
		assertEquals("Value of c is not in the range of permitted values",tester3a.check());
		
		Triangle tester3b = new Triangle(1,1,-9);
		assertEquals("Value of c is not in the range of permitted values",tester3b.check());
		
		Triangle tester3c = new Triangle(1,1,202);
		assertEquals("Value of c is not in the range of permitted values",tester3c.check());
		
		Triangle tester3d = new Triangle(1,1,455);
		assertEquals("Value of c is not in the range of permitted values",tester3d.check());*/
		
		// Test whether it is an Equilateral
		Triangle tester4 = new Triangle(1,1,1);
		assertEquals("It is an Equilateral Triangle!",tester4.check());
		
		Triangle tester4a = new Triangle(2,2,2);
		assertEquals("It is an Equilateral Triangle!",tester4a.check());
		
		Triangle tester4b = new Triangle(101,101,101);
		assertEquals("It is an Equilateral Triangle!",tester4b.check());
		
		Triangle tester4c = new Triangle(199,199,199);
		assertEquals("It is an Equilateral Triangle!",tester4c.check());
		
		Triangle tester4d = new Triangle(100,100,100);
		assertEquals("It is an Equilateral Triangle!",tester4d.check());
		
		Triangle tester4e = new Triangle(55,55,55);
		assertEquals("It is an Equilateral Triangle!",tester4e.check());
		
		// Test whether it is an Isosceles
		
		Triangle tester5 = new Triangle(2,2,3);
		assertEquals("It is a Isosceles Triangle!",tester5.check());
		
		Triangle tester5a = new Triangle(55,55,70);
		assertEquals("It is a Isosceles Triangle!",tester5a.check());
		
		Triangle tester5b = new Triangle(56,78,78);
		assertEquals("It is a Isosceles Triangle!",tester5b.check());
		
		Triangle tester5c = new Triangle(167,98,98);
		assertEquals("It is a Isosceles Triangle!",tester5c.check());
		
		Triangle tester5d = new Triangle(199,199,10);
		assertEquals("It is a Isosceles Triangle!",tester5d.check());
		
		Triangle tester5e = new Triangle(199,199,3);
		assertEquals("It is a Isosceles Triangle!",tester5e.check());
		
		// Test whether it is an Scalene
		
		Triangle tester6 = new Triangle(4,2,3);
		assertEquals("It is a Scalene Triangle!",tester6.check());
		
		Triangle tester6a = new Triangle(199, 198, 197);
		assertEquals("It is a Scalene Triangle!",tester6a.check());
		
		Triangle tester6b = new Triangle(198, 3, 197);
		assertEquals("It is a Scalene Triangle!",tester6b.check());
		
		Triangle tester6c = new Triangle(187, 103, 99);
		assertEquals("It is a Scalene Triangle!",tester6c.check());
		
		Triangle tester6d = new Triangle(2, 6, 7);
		assertEquals("It is a Scalene Triangle!",tester6d.check());
		
		Triangle tester6e = new Triangle(10, 12, 17);
		assertEquals("It is a Scalene Triangle!",tester6e.check());
		
		// Test whether it is not a triangle 
		
		
		Triangle tester7 = new Triangle(2,1,4);
		assertEquals("It is NOT a Triangle!",tester7.check());
		
		Triangle tester7a = new Triangle(3,1,2);
		assertEquals("It is NOT a Triangle!",tester7a.check());
		
		Triangle tester7b = new Triangle(199,200,1);
		assertEquals("It is NOT a Triangle!",tester7b.check());
		
		Triangle tester7c = new Triangle(198,200,2);
		assertEquals("It is NOT a Triangle!",tester7c.check());
		
		Triangle tester7d = new Triangle(1,1,3);
		assertEquals("It is NOT a Triangle!",tester7d.check());
		
		Triangle tester7e = new Triangle(10,10,25);
		assertEquals("It is NOT a Triangle!",tester7e.check());
		
		
	}

}
