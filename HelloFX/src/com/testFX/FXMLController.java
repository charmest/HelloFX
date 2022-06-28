package com.testFX;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Controller linked to the FXML layout
 * @author Thomas CHARMES
 */
public class FXMLController {

	private int girlfriendCount = 0;
	@FXML
	private Label girlfriendCountLabel;
	@FXML
	private VBox vbox;
	@FXML
	private HBox hbox;
	@FXML
	private Label textLabel;
	@FXML
	private Button addGirlfriendButton;
	@FXML
	private Button removeGirlfriendButton;
	
	@FXML
	private void colorAddButton() {
		this.addGirlfriendButton.setStyle("-fx-background-color:#FFE4D0;");
	}
	
	@FXML
	private void colorRemoveButton() {
		this.removeGirlfriendButton.setStyle("-fx-background-color:#FFE4D0;");
	}
	
	@FXML
	private void uncolorAddButton() {
		this.addGirlfriendButton.setStyle("-fx-background-color:#ECF9FF;");
	}
	
	@FXML
	private void uncolorRemoveButton() {
		this.removeGirlfriendButton.setStyle("-fx-background-color:#ECF9FF;");
	}
	
	@FXML
	private void addGirlfriend() {
		setGirlfriendCount(getGirlfriendCount()+1);
		updateStatusLabel();
		removeGirlfriendButton.setDisable(false);
	}
	
	@FXML
	private void removeGirlfriend() {
		if (getGirlfriendCount() > 0) {
			setGirlfriendCount(getGirlfriendCount()-1);
			updateStatusLabel();
		}
		if (getGirlfriendCount() == 0)
			removeGirlfriendButton.setDisable(true);
	}

	void updateStatusLabel() {
		if (this.getGirlfriendCount() == 1)
			girlfriendCountLabel.setText("J'ai actuellement " + this.getGirlfriendCount() + " copine et c'est normal.");
		else if (this.getGirlfriendCount() == 0)
			girlfriendCountLabel
			.setText("Je n'ai pas de copine et c'est bien triste...");
		else
			girlfriendCountLabel.setText(
					"J'ai actuellement " + this.getGirlfriendCount() + " copines et je suis donc un coureur de jupons.");
		int newFontSize = 14+getGirlfriendCount();
		this.girlfriendCountLabel.setStyle("-fx-font-size:"+newFontSize+"px;");
	}

	public int getGirlfriendCount() {
		return girlfriendCount;
	}

	public void setGirlfriendCount(int girlfriendCount) {
		this.girlfriendCount = girlfriendCount;
	}

}
