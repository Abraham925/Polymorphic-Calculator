package calc;

public interface PlusMinusStates {
	void input(CalcStorage storage, String newNumber, CalculatorFace face);
}
class Negative implements PlusMinusStates{
	public void input(CalcStorage storage, String newNumber, CalculatorFace face) {
		storage.setScreen(String.valueOf(Math.abs(Double.parseDouble(newNumber))));;
		face.writeToScreen(storage.getScreen());
		storage.setPlusMinusState(new Positive());
	}
}

class Positive implements PlusMinusStates{
	public void input(CalcStorage storage, String newNumber, CalculatorFace face) {
		String x = storage.getScreen();
		storage.setScreen("");
		storage.setScreen("-"+x);
		face.writeToScreen(storage.getScreen());
		storage.setPlusMinusState(new Negative());
	}
}