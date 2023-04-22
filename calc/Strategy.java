package calc;
/**
 * Interface with the different calculations
 * @author abrahamaustin
 *
 */
public interface Strategy {
	Double operate(Double a, Double b);
}
/**
 * when there is no operation this is called
 * @author abrahamaustin
 *
 */
class NoOperation implements Strategy{
	 public Double operate(Double a, Double b) {
		 
		 return b;
	 }
}
/**
 * This is called for Addition
 * @author abrahamaustin
 *
 */
 class Add implements Strategy{
	 public Double operate(Double a, Double b) {
		 System.out.println("+");
		 return a + b;
	 }
 }
/**
 * called to perform Subtraction
 * @author abrahamaustin
 *
 */
 class Sub implements Strategy{
	 public Double operate(Double a, Double b) {
		 return a - b;
	 }
 }
 /**
  * called to perform Multiplication
  * @author abrahamaustin
  *
  */
 class Mult implements Strategy{
	 public Double operate(Double a, Double b) {
		 return a * b;
	 }
 }
 /**
  * Called to perform Division
  * @author abrahamaustin
  *
  */
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
