
public class basicClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNumber = 0;
		
		recursiveFunction(myNumber);
		System.out.println(" ");
		
	}

	public static void recursiveFunction(int myNumber) {
		System.out.println("myNumber is: " + myNumber);
		myNumber++;
		
		if (myNumber > 5) {
			System.out.println("myNumber is greater than 5; stopping");
		}
		else {
			System.out.println("myNumber is <= 5; adding to myNumber");
			
			recursiveFunction(myNumber);	// and pass it to itself
		}
		
		System.out.println("Now, for the unwinding....");
		System.out.println("in the unwinding, myNumber is: " + myNumber);
	}
}
