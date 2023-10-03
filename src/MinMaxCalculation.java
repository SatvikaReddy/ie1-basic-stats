import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class MinMaxCalculation implements View {

	//Instance variables
	double Min;
    double Max; 
	JTextField jtfMin;  
    String minmax;
	String name;

	public MinMaxCalculation() {
		Min = 0;
		jtfMin = new JTextField(5);
		jtfMin.setEditable(false);
		name = "Min and Max ";
	}

	@Override
	public void update(ArrayList<Double> numbers) {
		Min = BasicStats.minimum(BasicStats.getArrayDouble(numbers));
        Max = BasicStats.maximum(BasicStats.getArrayDouble(numbers));

        minmax = String.valueOf(Min) + " " + String.valueOf(Max);
        

    //Set text
    jtfMin.setText("" + minmax );
	}

	@Override
	public void reset() {
		jtfMin.setText("");
	}

	@Override
	public JTextComponent show() {
		return jtfMin;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getMinMax() {
		return minmax;
	}

}