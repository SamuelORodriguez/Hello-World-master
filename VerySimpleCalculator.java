

public class VerySimpleCalculator {

	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private int sum1;
	/**
	 * 
	 */
	private double sum2;
	/**
	 * Getter of name
	 */
	public String getName() {
	 	 return name; 
	}
	/**
	 * Setter of name
	 */
	public void setName(String name) { 
		 this.name = name; 
	}
	/**
	 * Getter of sum1
	 */
	public int getSum1() {
	 	 return sum1; 
	}
	/**
	 * Setter of sum1
	 */
	public void setSum1(int sum1) { 
		 this.sum1 = sum1; 
	}
	/**
	 * Getter of sum2
	 */
	public double getSum2() {
	 	 return sum2; 
	}
	/**
	 * Setter of sum2
	 */
	public void setSum2(double sum2) { 
		 this.sum2 = sum2; 
	}
	/**
	 * 
	 */
	public VerySimpleCalculator() { 
		this.name = null;
	 }
	/**
	 * 
	 * @param num2 
	 * @param num1 
	 * @return 
	 */
	public double addTwoNumbers(double num2, double num1) { 
		sum2 = num1 + num2;
		return sum2;
	 }
	/**
	 * 
	 * @param num1 
	 * @param num2 
	 * @return 
	 */
	public int addTwoNumbers(int num1, int num2) { 
		sum1 = num1 + num2;
		return sum1;
	 }
	/**
	 * 
	 * @param name 
	 */
	public VerySimpleCalculator(String name) { 
		this.name = name;
	 } 
	public String toString() { 
		// TODO Auto-generated method
		return name + " " + sum1 + " " + sum2;

	 } 
}