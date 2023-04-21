package calc;

public interface CalcState {
	void input(CalcStorage storage, String newNumber);
}

class NormalState implements CalcState{
	 public void input(CalcStorage storage, String newNumber) {
		 storage.addToScreen(newNumber);
	 }
}

class AfterEqualsState implements CalcState{
	 public void input(CalcStorage storage, String newNumber) {
		 storage.setScreen("");
		 storage.addToScreen(newNumber);
		 storage.setState(new NormalState());
	 }
}