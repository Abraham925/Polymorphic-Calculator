package calc;

/**
 * CalcStorage
 * 
 * Acts as a storage for the numbers and operator values
 *
 * @author Abraham Austin
 * CS 245, Wheaton College
 * Feb 13, 2023
*/

public class CalcStorage {
	double opValue; //value of the second number
	String screen; //the first number
	boolean usedOpValue; // is there a second number
	char op; // The operator
	boolean textBool; // is there a first number
	String prev;//previous operation
	boolean prevBool;//is there a previous operation
	
	public CalcStorage() {
		screen = "";
		opValue = 0.0;
		usedOpValue = false;
		op = ' ';
		textBool = false;
		prev = "";
		prevBool = false;
	}
	/**
	 * stores the first number
	 * @param x passes the current number displayed
	 */
	public void setText(String x) {
		screen = screen.concat(x);
		textBool = true;
	}
	/**
	 * reset the current number to an empty string
	 */
	public void resetText() {
		screen = "";
		textBool = false;
	}
	/**
	 * gets the current text
	 * @return returns the current text
	 */
	public String getText(){
		return screen;
	}
	/**
	 * checks if the first number has been set
	 * @return returns true or false if the first number has been set
	 */
	public boolean textBool() {
		return textBool;
	}
	/**
	 * sets the value of the second number
	 * @param g the double of the of the second number
	 */
	public void setOperatorValue(double g) {
		opValue = g;
		usedOpValue = true;
	}
	/**
	 * gets the second number
	 * @return returns the second number
	 */
	public double getOperatorValue() {
		return opValue;
	}
	/**
	 * checks if there is a second number
	 * @return returns true if there is a second number, false if not
	 */
	public boolean valueUsed() {
		return usedOpValue;
	}
	/**
	 * sets the second Operator value to false
	 */
	public void valueReset() {
		usedOpValue = false;
	}
	/**
	 * sets the operator
	 * @param h the operator
	 */
	public void setOperator(char h) {
		op = h;
	}
	/**
	 * gets the operator
	 * @return returns the operator
	 */
	public char getOperator() {
		return op;
	}
	public void setPrev(String x) {
		prev = x;
		prevBool = true;
	}
	public String getPrev() {
		return prev;
	}
	public boolean isPrev() {
		return prevBool;
	}
	public void resetPrev() {
		prevBool = false;
	}
}
