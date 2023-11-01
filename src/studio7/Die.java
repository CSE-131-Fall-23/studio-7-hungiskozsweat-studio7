package studio7;

public class Die {

	private int n;
	
	public Die(int inputN) {
		this.n = inputN;
		this.rollChance = (int)(Math.random()*(n)+1);
	}
	
	private  
	
	public void print() {
		System.out.println(n + " sides: " + rollChance);
	}
	
	 public static void main(String[] args) {
		Die die1 = new Die(100);
		die1.print();
		die1.print();
	 }
	
	
}
