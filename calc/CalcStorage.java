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
	}
	public void perform() {
		val = op.operate(val, Double.parseDouble(currentDisplay));
		System.out.println(val);
		currentDisplay=String.valueOf(val);
		op = new NoOperation();
	}
}
