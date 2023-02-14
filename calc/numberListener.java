package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class numberListener implements ActionListener {

	CalculatorFace face;
	int x;
	CalcStorage storage;
	
	public numberListener(CalculatorFace face, int x, CalcStorage storage) {
		this.face = face;
		this.x = x;
		this.storage = storage;

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		for(int i=0; i<10;i++) {
			if(i==x) {
				String str = String.valueOf(i);
				storage.setText(str);
				face.writeToScreen(storage.getText());

			}
		}
	}

}
