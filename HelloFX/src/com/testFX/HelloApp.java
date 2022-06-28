package com.testFX;

import java.net.URISyntaxException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Launch the JavaFX application
 * @author Thomas CHARMES
 */
public class HelloApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
		Scene scene = new Scene(root, 1150, 600);
		primaryStage.setTitle("Es-tu un coureur de jupons ?");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) throws URISyntaxException {
		launch(args);
	}

}
