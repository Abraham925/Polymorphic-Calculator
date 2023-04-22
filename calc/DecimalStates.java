package calc;
/**
 * states of decimals
 * @author abrahamaustin
 *
 */
/**
 * interface for decimal states
 * 
 *
 */
public interface DecimalStates {
	//method that must be in all decimal states
	void input(CalcStorage storage, CalculatorFace face);
}
class DecimalState implements DecimalStates{
	//when there already is a decimal it does nothing
	public void input(CalcStorage storage, CalculatorFace face) {
		
	}
}
/*
 * State when there is no decimal
 *
 */
class NoDecimalState implements DecimalStates{
	/**
	 * adds a decimal and sets the state to decimalstate
	 */
	public void input(CalcStorage storage, CalculatorFace face) {
		storage.addToScreen(".");
		face.writeToScreen(storage.getScreen());
		storage.setDecimalState(new DecimalState());
	}
}