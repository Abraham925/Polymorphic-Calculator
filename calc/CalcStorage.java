package calc;

public class CalcStorage {
	double x;
	String screen;
	boolean f;
	char op;
	boolean u;
	public CalcStorage() {
		screen = "";
		x = 0.0;
		f = false;
		op = ' ';
		u = false;
	}
	
	public void setText(String x) {
		screen = screen.concat(x);
	}
	public void resetText() {
		screen = "";
	}
	public String getText(){
		return screen;
	}
	public void setOperatorValue(double g) {
		x = g;
		f = true;
	}
	public void resetOperatorValue() {
		f = false;
	}
	public double getOperatorValue() {
		return x;
	}
	public boolean valueUsed() {
		return f;
	}
	public boolean operatorUsed() {
		return u;
	}
	public void valueReset() {
		f = false;	
	}
	public void setOperator(char h) {
		op = h;
		u = true;
	}
	public char getOperator() {
		return op;
	}
	
}
