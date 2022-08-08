package application;
import shapes.TriangularPrism;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import shapes.TriangularPrism;

public class TriPrismController {
	private Stage stage;
	private Parent root;
	private Scene scene;
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
	void goBack(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("/scenes/GeoCalcMain.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root, 800, 750);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	private void calculate() {
		double length = Double.parseDouble(baseSideTextField.getText());
		double height = Double.parseDouble(heightTextField.getText());
		TriangularPrism tri = new TriangularPrism(height, length);
		baseAreaTextField.setText(String.format("%.2f", tri.getBaseArea()));
		volumeTextField.setText(String.format("%.2f", tri.getVolume()));
		
	}
	

}
