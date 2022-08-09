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
	// Instance variables
	private Stage stage;
	private Scene scene;
	private Parent root;
	// FXML objects
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

	@FXML
	/**
	 * Method that changes scenes to the triangular prism scene to perform
	 * calculations
	 * 
	 * @throws IOException if any errors
	 */
	private void triPrismCalc() throws IOException {
		String sceneType = "tri";
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/scenes/TriPrismScene.fxml"));
		root = loader.load();
		PrismsController tri = loader.getController();
		tri.setSceneType(sceneType);
		AnchorPane pane = (AnchorPane) root;
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	/**
	 * Method to reduce the opacity of the triangular prism image by half once
	 * hovered over
	 */
	private void triPrismChangeHue() {
		triPrism.setOpacity(.5);

	}

	@FXML
	/**
	 * Method to reset the opacity of triangular prism image back to 100%
	 */
	private void triPrismResetHue() {
		triPrism.setOpacity(1);

	}

	@FXML
	/**
	 * Method that changes scenes to the tetragonal prism scene to perform
	 * calculations
	 * 
	 * @throws IOException if any errors
	 */
	private void tetraPrismCalc() throws IOException {
		String sceneType = "tetra";
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/scenes/TetraPrismScene.fxml"));
		root = loader.load();
		PrismsController tri = loader.getController();
		tri.setSceneType(sceneType);
		AnchorPane pane = (AnchorPane) root;
		rootPane.getChildren().setAll(pane);

	}

	@FXML
	/**
	 * Method to reduce the opacity of the tetragonal prism image by half once
	 * hovered over
	 */
	private void tetraPrismChangeHue() {
		tetraPrism.setOpacity(.5);

	}

	@FXML
	/**
	 * Method to reset the opacity of tetragonal prism image back to 100%
	 */
	private void tetraPrismResetHue() {
		tetraPrism.setOpacity(1);

	}

	@FXML
	/**
	 * Method that changes scenes to the pentagonal prism scene to perform
	 * calculations
	 * 
	 * @throws IOException if any errors
	 */
	private void pentaPrismCalc() throws IOException {
		String sceneType = "penta";
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/scenes/PentaPrismScene.fxml"));
		root = loader.load();
		PrismsController tri = loader.getController();
		tri.setSceneType(sceneType);
		AnchorPane pane = (AnchorPane) root;
		rootPane.getChildren().setAll(pane);

	}

	@FXML
	/**
	 * Method to reduce the opacity of the pentagonal prism image by half once
	 * hovered over
	 */
	private void pentaPrismChangeHue() {
		pentaPrism.setOpacity(.5);

	}

	@FXML
	/**
	 * Method to reset the opacity of pentagonal prism image back to 100%
	 */
	private void pentaPrismResetHue() {
		pentaPrism.setOpacity(1);

	}

	@FXML
	/**
	 * Method that changes scenes to the hexagonal prism scene to perform
	 * calculations
	 * 
	 * @throws IOException if any errors
	 */
	private void hexaPrismCalc() throws IOException {
		String sceneType = "hexa";
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/scenes/HexaPrismScene.fxml"));
		root = loader.load();
		PrismsController tri = loader.getController();
		tri.setSceneType(sceneType);
		AnchorPane pane = (AnchorPane) root;
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	/**
	 * Method to reduce the opacity of the hexagonal prism image by half once
	 * hovered over
	 */
	private void hexaPrismChangeHue() {
		hexaPrism.setOpacity(.5);

	}

	@FXML
	/**
	 * Method to reset the opacity of hexagonal prism image back to 100%
	 */
	private void hexaPrismResetHue() {
		hexaPrism.setOpacity(1);

	}

	@FXML
	/**
	 * Method that changes scenes to the heptagonal prism scene to perform
	 * calculations
	 * 
	 * @throws IOException if any errors
	 */
	private void heptaPrismCalc() throws IOException {
		String sceneType = "hepta";
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/scenes/HeptaPrismScene.fxml"));
		root = loader.load();
		PrismsController tri = loader.getController();
		tri.setSceneType(sceneType);
		AnchorPane pane = (AnchorPane) root;
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	/**
	 * Method to reduce the opacity of the heptagonal prism image by half once
	 * hovered over
	 */
	private void heptaPrismChangeHue() {
		heptaPrism.setOpacity(.5);

	}

	@FXML
	/**
	 * Method to reset the opacity of heptagonal prism image back to 100%
	 */
	private void heptaPrismResetHue() {
		heptaPrism.setOpacity(1);

	}

	@FXML
	/**
	 * Method that changes scenes to the octagonal prism scene to perform
	 * calculations
	 * 
	 * @throws IOException if any errors
	 */
	private void octaPrismCalc() throws IOException {
		String sceneType = "octa";
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/scenes/OctaPrismScene.fxml"));
		root = loader.load();
		PrismsController tri = loader.getController();
		tri.setSceneType(sceneType);
		AnchorPane pane = (AnchorPane) root;
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	/**
	 * Method to reduce the opacity of the octagonal prism image by half once
	 * hovered over
	 */
	private void octaPrismChangeHue() {
		octaPrism.setOpacity(.5);

	}

	@FXML
	/**
	 * Method to reset the opacity of heptagonal prism image back to 100%
	 */
	private void octaPrismResetHue() {
		octaPrism.setOpacity(1);

	}

	@FXML
	/**
	 * Method that changes scenes to the enneagonal prism scene to perform
	 * calculations
	 * 
	 * @throws IOException if any errors
	 */
	private void nonaPrismCalc() throws IOException {
		String sceneType = "nona";
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/scenes/NonaPrismScene.fxml"));
		root = loader.load();
		PrismsController tri = loader.getController();
		tri.setSceneType(sceneType);
		AnchorPane pane = (AnchorPane) root;
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	/**
	 * Method to reduce the opacity of the enneagonal prism image by half once
	 * hovered over
	 */
	private void nonaPrismChangeHue() {
		nonaPrism.setOpacity(.5);

	}

	@FXML
	/**
	 * Method to reset the opacity of enneagonal prism image back to 100%
	 */
	private void nonaPrismResetHue() {
		nonaPrism.setOpacity(1);

	}

	@FXML
	/**
	 * Method that changes scenes to the decagonal prism scene to perform
	 * calculations
	 * 
	 * @throws IOException if any errors
	 */
	private void decaPrismCalc() throws IOException {
		String sceneType = "deca";
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/scenes/DecaPrismScene.fxml"));
		root = loader.load();
		PrismsController tri = loader.getController();
		tri.setSceneType(sceneType);
		AnchorPane pane = (AnchorPane) root;
		rootPane.getChildren().setAll(pane);
	}

	@FXML
	/**
	 * Method to reduce the opacity of the decagonal prism image by half once
	 * hovered over
	 */
	private void decaPrismChangeHue() {
		decaPrism.setOpacity(.5);

	}

	@FXML
	/**
	 * Method to reset the opacity of decagonal prism image back to 100%
	 */
	private void decaPrismResetHue() {
		decaPrism.setOpacity(1);

	}

}
