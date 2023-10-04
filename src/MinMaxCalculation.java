import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import java.util.Collections;

public class MinMaxCalculation implements View {

	private double max;
	private double min;
	private String name;
	private JTextField jtfMinMax;

	public MinMaxCalculation() {
		min = 0;
		max = 0;
		jtfMinMax = new JTextField(9);
		jtfMinMax.setEditable(false);
		name = "Min, Max ";
	}

	@Override
	public void update(ArrayList<Double> numbers) {
		if (numbers.isEmpty()) {
			min = 0;
			max = 0;
		} else {
			min = Collections.min(numbers);
			max = Collections.max(numbers);
		}

		// Set text
		jtfMinMax.setText(String.format("%.2f, %.2f", min, max));
	}

	@Override
	public void reset() {
		jtfMinMax.setText("");
	}

	@Override
	public JTextComponent show() {
		return jtfMinMax;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getMinMax() {
		return String.format("%.2f, %.2f", min, max);
	}
}

