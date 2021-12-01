package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Calculator {

	private String operator = "";
	private double x = 0;
	private Model model = new Model();

	@FXML
	private Text result;

	@FXML
	void clear(ActionEvent event) {
		result.setText("");
	}

	@FXML
	void operand(ActionEvent event) {
		result.setText(result.getText() + ((Button) event.getSource()).getText());
	}

	@FXML
	void operator(ActionEvent event) throws Exception {

		try {
			if (((Button) event.getSource()).getText().equals("=")) {
				result.setText(model.calculate(operator, x, Double.parseDouble(result.getText())) + "");
			} else {
				operator = ((Button) event.getSource()).getText();
				x = Double.parseDouble(result.getText());
				result.setText("");
			}
		} catch (NumberFormatException e) {
			result.setText("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
