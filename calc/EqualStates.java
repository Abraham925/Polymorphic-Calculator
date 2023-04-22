package calc;

public interface EqualStates {
	void input(CalcStorage storage, String newNumber, CalculatorFace face);
}

class NormalState implements EqualStates{
	 public void input(CalcStorage storage, String newNumber, CalculatorFace face) {
		 storage.addToScreen(newNumber);
		 face.writeToScreen(storage.getScreen());
	 }
}

class AfterEqualsState implements EqualStates{
	 public void input(CalcStorage storage, String newNumber, CalculatorFace face) {
		 storage.setScreen("");
		 storage.addToScreen(newNumber);
		 face.writeToScreen(storage.getScreen());
		 storage.setState(new NormalState());
		 storage.setDecimalState(new NoDecimalState());
	 }
}
