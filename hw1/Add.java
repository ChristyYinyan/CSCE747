package hw1;
import java.util.*;


public class Add {
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.println("Give a number: ");
		int num = a.nextInt();
	
		System.out.println(add(num));
		
	}
	public static int sum = 0;
	public static int add(int num){
		if(num==1){
			sum += 1;
			return sum;
		}else{
			sum = add(num-1) + num; 
		}	
		return sum; 
	}
}
