package calc;

/**
 * SetUp
 * 
 * Class to set up and start the calculator, plus
 * facilities for test-driving the calculator.
 *
 * @author Thomas VanDrunen
 * CS 245, Wheaton College
 * June 27, 2014
*/
public class SetUp {

	/**
	 * Method for initializing the calculator internals and
	 * connecting them to the calculator face.
	 * @param face The component representing the user interface of 
	 * the calculator. 
	 */
	public static void setUpCalculator(CalculatorFace face) {

		CalcStorage storage = new CalcStorage();


		for(int i = 0; i<10; i++) {
			face.addNumberActionListener(i, new numberListener(face, i, storage));

		}
		face.addPlusMinusActionListener(new PlusMinusListener(face, storage));
		face.addActionListener('.', new OperatorListener(face, '.', storage));
		face.addActionListener('+', new OperatorListener(face, '+', storage));
		face.addActionListener('-', new OperatorListener(face, '-', storage));
		face.addActionListener('*', new OperatorListener(face, '*', storage));
		face.addActionListener('/', new OperatorListener(face, '/', storage));
		face.addActionListener('=', new OperatorListener(face, '=', storage));
		face.addActionListener('C', new OperatorListener(face, 'C', storage));
		// add code here that will have the effect of connecting
		// the given face to your calculator
		
		
	}
	

	/**
	 * This main method is for your testing of your calculator.
	 * It will *not* be used during grading. Any changes you make
	 * to this method will be ignored at grading.
	 */
	public static void main(String[] args) {
		setUpCalculator(new PlainCalculatorFace());
	}

}