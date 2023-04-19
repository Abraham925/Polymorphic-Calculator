package calc;

public interface Strategy {
	Double operate(Double a, Double b);
}
 class Add implements Strategy{
	 public Double operate(Double a, Double b) {
		 return a + b;
	 }
 }

 class Sub implements Strategy{
	 public Double operate(Double a, Double b) {
		 return a - b;
	 }
 }
 class Mult implements Strategy{
	 public Double operate(Double a, Double b) {
		 return a * b;
	 }
 }
 class Div implements Strategy{
	 public Double operate(Double a, Double b) {
		 if(b != 0) {
			 return a/b;
		 }
		 else {
			 throw new ArithmeticException("Division by zero");
		 }
	 }
 }
