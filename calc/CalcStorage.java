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
	private String currentDisplay = "";
	private Double val = 0.0;
	private Strategy op = new NoOperation();
	private EqualStates state = new NormalState();
	private DecimalStates decimalState = new NoDecimalState();
	private PlusMinusStates plusminus = new Positive();
	
	public void inputPlusMinus(String newNumber, CalculatorFace face) {
		plusminus.input(this, newNumber, face);
	}
	public void setPlusMinusState(PlusMinusStates plusminus) {
		this.plusminus = plusminus;
	}
	public void setDecimalState(DecimalStates decimalState) {
		this.decimalState = decimalState;
	}
	public void inputDecimal(CalculatorFace face) {
		decimalState.input(this, face);
	}
	public void setState(EqualStates state) {
		this.state = state;
	}
	public String getScreen() {
		return currentDisplay;
	}
	public void setScreen(String currentDisplay) {
		this.currentDisplay = currentDisplay;
	}
	public void addToScreen(String value) {
		currentDisplay += value;
	}
	public void setVal(Double val) {
		this.val = val;
	}	
	public void setOp(Strategy op) {
		this.op = op;
	}
	public void clear() {
		currentDisplay = "";
		val = 0.0;
		op = new NoOperation();
		state = new NormalState();
		decimalState = new NoDecimalState();
		plusminus = new Positive();
	}
	public void perform() {
		val = op.operate(val, Double.parseDouble(currentDisplay));
		System.out.println(val);
		currentDisplay=String.valueOf(val);
		op = new NoOperation();
		state = new AfterEqualsState();
	}
	public void input(String newNumber, CalculatorFace face) {
		state.input(this, newNumber, face);
	}
}
