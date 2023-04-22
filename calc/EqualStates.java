package calc;
/**
 * states for the equals sign
 * @author abrahamaustin
 *
 */
public interface EqualStates {
	void input(CalcStorage storage, String newNumber, CalculatorFace face);
}
/**
 * state for before the press of the equal sign
 * @author abrahamaustin
 *
 */
class NormalState implements EqualStates{
	/**
	 * acts as it would normally, just interacts with the numbers in some way
	 */
	 public void input(CalcStorage storage, String newNumber, CalculatorFace face) {
		 storage.addToScreen(newNumber);
		 face.writeToScreen(storage.getScreen());
	 }
}
/**
 * state for after the press of the equal sign
 * @author abrahamaustin
 *
 */
class AfterEqualsState implements EqualStates{
	/**
	 * takes the value from the last operation for the next
	 */
	 public void input(CalcStorage storage, String newNumber, CalculatorFace face) {
		 storage.setScreen("");
		 storage.addToScreen(newNumber);
		 face.writeToScreen(storage.getScreen());
		 storage.setState(new NormalState());
		 storage.setDecimalState(new NoDecimalState());
	 }
}
