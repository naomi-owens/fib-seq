
public class FibonacciSequence {
	private int n = 0;
	private int i = 1;
	private boolean done;


	public FibonacciSequence(){
		startFibonacci();
	}
	
	public void startFibonacci(){
		
		while(!done){
			System.out.print(n + "," + i + ",");
			n = n + i;
			i = n + i;
		}
	}

	public static void main(String[] args){
		new FibonacciSequence();
	}
}
