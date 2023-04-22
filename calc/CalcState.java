package calc;

public interface CalcState {
	void input(CalcStorage storage, String newNumber, CalculatorFace face);
}

class NormalState implements CalcState{
	 public void input(CalcStorage storage, String newNumber, CalculatorFace face) {
		 storage.addToScreen(newNumber);
		 face.writeToScreen(storage.getScreen());
	 }
}

class AfterEqualsState implements CalcState{
	 public void input(CalcStorage storage, String newNumber, CalculatorFace face) {
		 storage.setScreen("");
		 storage.addToScreen(newNumber);
		 face.writeToScreen(storage.getScreen());
		 storage.setState(new NormalState());
	 }
}