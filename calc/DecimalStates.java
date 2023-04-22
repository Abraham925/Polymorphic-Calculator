package calc;

public interface DecimalStates {
	void input(CalcStorage storage, CalculatorFace face);
}
class DecimalState implements DecimalStates{
	public void input(CalcStorage storage, CalculatorFace face) {
		
	}
}

class NoDecimalState implements DecimalStates{
	public void input(CalcStorage storage, CalculatorFace face) {
		storage.addToScreen(".");
		face.writeToScreen(storage.getScreen());
		storage.setDecimalState(new DecimalState());
	}
}