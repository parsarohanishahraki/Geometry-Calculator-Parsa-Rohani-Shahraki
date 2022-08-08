package application;

import java.io.IOException;

import exception.InvalidInputException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import shapes.OctagonalPrism;

public class OctaPrismController {
	private Stage stage;
	private Parent root;
	private Scene scene;
	@FXML
	private TextField baseSideTextField;
	@FXML
	private TextField heightTextField;
	@FXML
	private Button Calculate;
	@FXML
	private TextField baseAreaTextField;
	@FXML
	private TextField volumeTextField;
	@FXML
	private Button goBackButton;
	@FXML
	private Label errorLabel;

	@FXML
	void goBack(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/scenes/GeoCalcMain.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 800, 750);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	private void calculate() {
		double length = 0;
		double height = 0;
		if (!isNumeric(baseSideTextField.getText()) || !isNumeric(heightTextField.getText())) {
			// throw new InvalidInputException();
			errorLabel.setText(new InvalidInputException().getMessage());
		} else {
			errorLabel.setText("");
			length = Double.parseDouble(baseSideTextField.getText());
			height = Double.parseDouble(heightTextField.getText());
		}

		OctagonalPrism octa = new OctagonalPrism(height, length);
		baseAreaTextField.setText(String.format("%.2f", octa.getBaseArea()));
		volumeTextField.setText(String.format("%.2f", octa.getVolume()));

	}

	public boolean isNumeric(String str) {
		if (str == null || str == "") {
			return false;
		}
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '.' && i < c.length - 1) {
				continue;
			}
			if (!Character.isDigit(c[i])) {
				return false;
			}
		}
		return true;

	}

}
