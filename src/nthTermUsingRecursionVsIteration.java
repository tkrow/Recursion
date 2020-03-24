
public class nthTermUsingRecursionVsIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("triangleNumberWithIteration(5): " + triangleNumberWithIteration(5));
		
		System.out.println("triangleNumberWithRecurstion(5): " + triangleNumberWithRecursion(5));
	}
	
	static int triangleNumberWithIteration(int n) {
		
		// total a value by taking a number, subtracting 1
		// from it, and adding that new value to the total.
		// int n = 5;	results in 5+4+3+2+1
		
		int total = 0;
		
		while(n > 0) {
			total = total + n;
			n--;
		}
		
		return total;
		
	}	// end triangleNumberWithIteration
	
	static int triangleNumberWithRecursion(int n) {
		
		// "base case" is the if statement
		if(n == 1) {
			return n;	// if 1 is passed in, return it back
		}
		else {
			return(n + triangleNumberWithRecursion(n - 1));
		}
		
	}

}
