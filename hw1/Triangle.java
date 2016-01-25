package hw1;
public class Triangle {
	int a, b, c;

	String result = "";

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String check() {
		if (a < 1 || a > 200) {
			result="Value of a is not in the range of permitted values";
			return result;
			
		}
		if (b < 1 || b > 200) {
			result="Value of b is not in the range of permitted values";
			return result;
		
		}
		if (c < 1 || c > 200) {
			result="Value of c is not in the range of permitted values";
			return result;
			
		}

		if ((a < b + c) && (b < a + c) && (c < a + b)) {

			if ((a == b) && (b == c)) {
				result="It is an Equilateral Triangle!";
				return result;
			}

			else if ((a == b) || (b == c) || (c == a)) {
				result="It is a Isosceles Triangle!";
				return result;
				
			} else {
				result= "It is a Scalene Triangle!";
				return result;
				
			}
		} else {
			result = "It is NOT a Triangle!";
			return result;
			
		}
	}

	public String toString() {
		return result;

	}
}