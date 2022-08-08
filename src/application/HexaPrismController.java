package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import shapes.HexagonalPrism;

public class HexaPrismController {
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
	void goBack(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/scenes/GeoCalcMain.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root, 800, 750);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	private void calculate() {
		int length = Integer.parseInt(baseSideTextField.getText());
		int height = Integer.parseInt(heightTextField.getText());
		HexagonalPrism hexa = new HexagonalPrism(height, length);
		baseAreaTextField.setText(String.format("%.2f", hexa.getBaseArea()));
		volumeTextField.setText(String.format("%.2f", hexa.getVolume()));

	}

}
