package calc;

/**
 * CalcStorage
 * 
 * Acts as a storage for the numbers and operator values
 *
 * @author Abraham Austin
 * CS 245, Wheaton College
 * Apr 21, 2023
*/

public class CalcStorage {
	private String currentDisplay = "";
	private Double val = 0.0;
	private Strategy op = new NoOperation();
	private EqualStates state = new NormalState();
	private DecimalStates decimalState = new NoDecimalState();
	private PlusMinusStates plusminus = new Positive();
	/**
	 * calls the state
	 * @param newNumber
	 * @param face
	 */
	public void inputPlusMinus(String newNumber, CalculatorFace face) {
		plusminus.input(this, newNumber, face);
	}
	/**
	 * sets the state for plus minus
	 * @param plusminus
	 */
	public void setPlusMinusState(PlusMinusStates plusminus) {
		this.plusminus = plusminus;
	}
	/**
	 * sets the state for the decimal
	 * @param decimalState
	 */
	public void setDecimalState(DecimalStates decimalState) {
		this.decimalState = decimalState;
	}
	/**
	 * calls when there is input for decimal button
	 * @param face
	 */
	public void inputDecimal(CalculatorFace face) {
		decimalState.input(this, face);
	}
	/**
	 * sets the state for the equals
	 * @param state
	 */
	public void setState(EqualStates state) {
		this.state = state;
	}
	/**
	 * gets what is on the screen
	 * @return screen
	 */
	public String getScreen() {
		return currentDisplay;
	}
	/**
	 * set thes the screen
	 * @param currentDisplay
	 */
	public void setScreen(String currentDisplay) {
		this.currentDisplay = currentDisplay;
	}
	/**
	 * appends to the screen
	 * @param value
	 */
	public void addToScreen(String value) {
		currentDisplay += value;
	}
	/**
	 * sets the stored value
	 * @param val
	 */
	public void setVal(Double val) {
		this.val = val;
	}	
	/**
	 * saves the operator
	 * @param op
	 */
	public void setOp(Strategy op) {
		this.op = op;
	}
	/**
	 * clears all the instance variables
	 */
	public void clear() {
		currentDisplay = "";
		val = 0.0;
		op = new NoOperation();
		state = new NormalState();
		decimalState = new NoDecimalState();
		plusminus = new Positive();
	}
	/**
	 * operates when there are two variables
	 */
	public void perform() {
		val = op.operate(val, Double.parseDouble(currentDisplay));
		System.out.println(val);
		currentDisplay=String.valueOf(val);
		op = new NoOperation();
		state = new AfterEqualsState();
	}
	/**
	 * called when the equals is called
	 * @param newNumber
	 * @param face
	 */
	public void input(String newNumber, CalculatorFace face) {
		state.input(this, newNumber, face);
	}
}
