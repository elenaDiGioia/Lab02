package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	AlienDictionary model= new AlienDictionary();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnClear;

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String inserita= txtParola.getText().toLowerCase();
    	if (inserita.contains(" ")) {
    			String[] word= inserita.split(" ");
    			if (word[0].matches("[a-z]*") && word[1].matches("[a-z]*")) {
    			model.addWord(word[0], word[1]);
    		}
    		else txtResult.setText("Le parole devono contenere solo lettere maiuscole o minuscole");
    	}
    	else {
    		if (inserita.matches("[a-z]*")) {
    			txtResult.setText(model.translateWord(inserita));
    		}
    		else {
    			txtResult.setText("La parola deve contenere solo lettere maiuscole o minuscole");
    		}
    	}

    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
