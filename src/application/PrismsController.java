package application;

import shapes.*;

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
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PrismsController {
	// Instance variables
	private Stage stage;
	private Parent root;
	private Scene scene;
	private String sceneType;
	// FXML objects
	@FXML
	private Button goBackButton;
	@FXML
	private Button calculateButton;
	@FXML
	private TextField baseSideTextField;
	@FXML
	private TextField baseAreaTextField;
	@FXML
	private TextField volumeTextField;
	@FXML
	private TextField heightTextField;
	@FXML
	private Label errorLabel;

	@FXML
	/**
	 * Method that changes the scene back to the original scene
	 * 
	 * @param event event node that triggers the method
	 * @throws IOException if any errors
	 */
	void goBack(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/scenes/GeoCalcMain.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 800, 750);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	/**
	 * Method that performs calculations based on the values entered by the user
	 * 
	 * @throws InvalidInputException if the input is of incorrect type
	 */
	private void calculate() {
		double length = 0;
		double height = 0;
		if (!isNumeric(baseSideTextField.getText()) || !isNumeric(heightTextField.getText())) {
			errorLabel.setText(new InvalidInputException().getMessage());
		} else {
			errorLabel.setText("");
			length = Double.parseDouble(baseSideTextField.getText());
			height = Double.parseDouble(heightTextField.getText());
		}
		/* The following if statements check what type of scene the application is currently on
		 * and determines which Prism object to create and instantiate
		*/
		if (this.sceneType.equals("tri")) {
			TriangularPrism tri = new TriangularPrism(height, length);
			baseAreaTextField.setText(String.format("%.2f", tri.getBaseArea()));
			volumeTextField.setText(String.format("%.2f", tri.getVolume()));
		} else if (this.sceneType.equals("tetra")) {
			SquarePrism tetra = new SquarePrism(height, length);
			baseAreaTextField.setText(String.format("%.2f", tetra.getBaseArea()));
			volumeTextField.setText(String.format("%.2f", tetra.getVolume()));
		} else if (this.sceneType.equals("penta")) {
			PentagonalPrism penta = new PentagonalPrism(height, length);
			baseAreaTextField.setText(String.format("%.2f", penta.getBaseArea()));
			volumeTextField.setText(String.format("%.2f", penta.getVolume()));
		} else if (this.sceneType.equals("hexa")) {
			HexagonalPrism hexa = new HexagonalPrism(height, length);
			baseAreaTextField.setText(String.format("%.2f", hexa.getBaseArea()));
			volumeTextField.setText(String.format("%.2f", hexa.getVolume()));
		} else if (this.sceneType.equals("hepta")) {
			HeptagonalPrism hepta = new HeptagonalPrism(height, length);
			baseAreaTextField.setText(String.format("%.2f", hepta.getBaseArea()));
			volumeTextField.setText(String.format("%.2f", hepta.getVolume()));
		} else if (this.sceneType.equals("octa")) {
			OctagonalPrism octa = new OctagonalPrism(height, length);
			baseAreaTextField.setText(String.format("%.2f", octa.getBaseArea()));
			volumeTextField.setText(String.format("%.2f", octa.getVolume()));
		} else if (this.sceneType.equals("nona")) {
			EnneagonalPrism enne = new EnneagonalPrism(height, length);
			baseAreaTextField.setText(String.format("%.2f", enne.getBaseArea()));
			volumeTextField.setText(String.format("%.2f", enne.getVolume()));
		} else if (this.sceneType.equals("deca")) {
			DecagonalPrism deca = new DecagonalPrism(height, length);
			baseAreaTextField.setText(String.format("%.2f", deca.getBaseArea()));
			volumeTextField.setText(String.format("%.2f", deca.getVolume()));
		}

	}

	/**
	 * Method that checks whether an input is a number or letters/special characters
	 * 
	 * @param str the String that will be checked
	 * @return true if it is numeric
	 */
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

	/**
	 * Method to set the scene type based on prism chosen by user
	 * 
	 * @param type type of scene
	 */
	public void setSceneType(String type) {
		this.sceneType = type;
	}

	/**
	 * Returns the type of scene
	 * 
	 * @return sceneType
	 */
	public String getSceneType() {
		return this.sceneType;
	}

}
