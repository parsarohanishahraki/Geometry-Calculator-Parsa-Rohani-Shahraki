package application;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MainController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	private AnchorPane rootPane;
	@FXML
	private ImageView triPrism;
	@FXML
	private ImageView tetraPrism;
	@FXML
	private ImageView pentaPrism;
	@FXML
	private ImageView hexaPrism;
	@FXML
	private ImageView heptaPrism;
	@FXML
	private ImageView octaPrism;
	@FXML
	private ImageView nonaPrism;
	@FXML
	private ImageView decaPrism;

//	public void trilogin(ActionEvent event) throws IOException{
//		root = FXMLLoader.load(getClass().getResource("TriPrismScene.fxml"));
//		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//		scene = new Scene(root, 800, 750);
//		stage.setScene(scene);
//		stage.show();
//	}

	@FXML
	private void triPrismCalc() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/scenes/TriPrismScene.fxml"));
		pane.setMaxHeight(500);
		rootPane.setMaxHeight(500);
		rootPane.getChildren().setAll(pane);

	}

	@FXML
	private void triPrismChangeHue() {
		triPrism.setOpacity(.5);

	}

	@FXML
	private void triPrismResetHue() {
		triPrism.setOpacity(1);

	}

	@FXML
	private void tetraPrismCalc() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/scenes/TetraPrismScene.fxml"));
		pane.setMaxHeight(500);
		rootPane.setMaxHeight(500);
		rootPane.getChildren().setAll(pane);

	}

	@FXML
	private void tetraPrismChangeHue() {
		tetraPrism.setOpacity(.5);

	}

	@FXML
	private void tetraPrismResetHue() {
		tetraPrism.setOpacity(1);

	}

	@FXML
	private void pentaPrismCalc() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/scenes/PentaPrismScene.fxml"));
		pane.setMaxHeight(500);
		rootPane.setMaxHeight(500);
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	private void pentaPrismChangeHue() {
		pentaPrism.setOpacity(.5);

	}

	@FXML
	private void pentaPrismResetHue() {
		pentaPrism.setOpacity(1);

	}

	@FXML
	private void hexaPrismCalc() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/scenes/HexagonalPrismScene.fxml"));
		pane.setMaxHeight(500);
		rootPane.setMaxHeight(500);
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	private void hexaPrismChangeHue() {
		hexaPrism.setOpacity(.5);

	}

	@FXML
	private void hexaPrismResetHue() {
		hexaPrism.setOpacity(1);

	}

	@FXML
	private void heptaPrismCalc() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/scenes/HeptaPrismScene.fxml"));
		pane.setMaxHeight(500);
		rootPane.setMaxHeight(500);
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	private void heptaPrismChangeHue() {
		heptaPrism.setOpacity(.5);

	}

	@FXML
	private void heptaPrismResetHue() {
		heptaPrism.setOpacity(1);

	}

	@FXML
	private void octaPrismCalc() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/scenes/OctaPrismScene.fxml"));
		pane.setMaxHeight(500);
		rootPane.setMaxHeight(500);
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	private void octaPrismChangeHue() {
		octaPrism.setOpacity(.5);

	}

	@FXML
	private void octaPrismResetHue() {
		octaPrism.setOpacity(1);

	}

	@FXML
	private void nonaPrismCalc() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/scenes/NonaPrismScene.fxml"));
		pane.setMaxHeight(500);
		rootPane.setMaxHeight(500);
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	private void nonaPrismChangeHue() {
		nonaPrism.setOpacity(.5);

	}

	@FXML
	private void nonaPrismResetHue() {
		nonaPrism.setOpacity(1);

	}

	@FXML
	private void decaPrismCalc() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/scenes/DecaPrismScene.fxml"));
		pane.setMaxHeight(500);
		rootPane.setMaxHeight(500);
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	private void decaPrismChangeHue() {
		decaPrism.setOpacity(.5);

	}

	@FXML
	private void decaPrismResetHue() {
		decaPrism.setOpacity(1);

	}

}
