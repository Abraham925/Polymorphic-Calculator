package calc;
/**
 * states for negative and positive
 * @author abrahamaustin
 *
 */
public interface PlusMinusStates {
	void input(CalcStorage storage, String newNumber, CalculatorFace face);
}
/**
 * when negative this is the state
 * @author abrahamaustin
 *
 */
class Negative implements PlusMinusStates{
	/**
	 * sets it positive
	 */
	public void input(CalcStorage storage, String newNumber, CalculatorFace face) {
		storage.setScreen(String.valueOf(Math.abs(Double.parseDouble(newNumber))));;
		face.writeToScreen(storage.getScreen());
		storage.setPlusMinusState(new Positive());
	}
}
/**
 * when positive this is the state
 * @author abrahamaustin
 *
 */
class Positive implements PlusMinusStates{
	/**
	 * sets it negative
	 */
	public void input(CalcStorage storage, String newNumber, CalculatorFace face) {
		String x = storage.getScreen();
		storage.setScreen("");
		storage.setScreen("-"+x);
		face.writeToScreen(storage.getScreen());
		storage.setPlusMinusState(new Negative());
	}
}