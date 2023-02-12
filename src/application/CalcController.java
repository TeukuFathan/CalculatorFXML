package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


public class CalcController {
	
	boolean add,subs,div,mul;
	float val1 = 0;
	float val2 = 0;
	float resultat = 0;
	
	@FXML
	TextArea tfTextHolder;
	
	
	
	@FXML
	private void initialize() {
		tfTextHolder.setText("");
	}
	@FXML
	private void un(ActionEvent evt) {
		tfTextHolder.appendText("1");		
	}
	@FXML
	private void zero(ActionEvent evt) {
		tfTextHolder.appendText("0");	
	}
	@FXML
	private void deux(ActionEvent evt) {
		tfTextHolder.appendText("2");
	}
	@FXML
	private void trois(ActionEvent evt) {
		tfTextHolder.appendText("3");
	}
	@FXML
	private void quatre(ActionEvent evt) {
		tfTextHolder.appendText("4");
	}
	@FXML
	private void cinq(ActionEvent evt) {
		tfTextHolder.appendText("5");
	}
	@FXML
	private void six(ActionEvent evt) {
		tfTextHolder.appendText("6");
	}
	@FXML
	private void sept(ActionEvent evt) {
		tfTextHolder.appendText("7");
	}
	@FXML
	private void huit(ActionEvent evt) {
		tfTextHolder.appendText("8");
	}
	@FXML
	private void neuf(ActionEvent evt) {
		tfTextHolder.appendText("9");
	}
	
	@FXML
	private void addition() {
		if(tfTextHolder.getText() != "") {
			
			tfTextHolder.appendText("+");
		}
		this.add = true;

	}
	@FXML
	private void subs() {
		if(tfTextHolder.getText() != "") {
			
			tfTextHolder.appendText("-");
		}
		this.subs = true;

	}
	@FXML
	private void mul() {
		if(tfTextHolder.getText() != "") {
			
			tfTextHolder.appendText("*");
		}
		this.mul = true;

	}
	@FXML
	private void div() {
		if(tfTextHolder.getText() != "") {
			
			tfTextHolder.appendText("/");
		}
		this.div = true;

	}
	@FXML
	private void clear() {
		
		
		resultat = 0;
		tfTextHolder.setText("");
		val1 = 0;
		val2 = 0;
	}
	
	
	@FXML
	private void res() {
		
		if(mul) {
			val1 = Float.parseFloat(tfTextHolder.getText().substring(0,tfTextHolder.getText().indexOf("*")));
			val2 = Float.parseFloat(tfTextHolder.getText().substring(tfTextHolder.getText().indexOf("*")+1));
			resultat = val1*val2;
			mul = false;
		}
		if(div) {
			val1 = Float.parseFloat(tfTextHolder.getText().substring(0,tfTextHolder.getText().indexOf("/")));
			val2 = Float.parseFloat(tfTextHolder.getText().substring(tfTextHolder.getText().indexOf("/")+1));
			// verif que val 2 != 0
			try {
				resultat = val1 / val2;
			}
			catch(ArithmeticException ae) {
				tfTextHolder.setText("Le division par 0 n'existais pas  :)");
			}
			div = false;
		}
		if(add) {
			val1 = Float.parseFloat(tfTextHolder.getText().substring(0,tfTextHolder.getText().indexOf("+")));
			val2 = Float.parseFloat(tfTextHolder.getText().substring(tfTextHolder.getText().indexOf("+")+1));
			resultat = val1 + val2;
			add = false;
		}
		if(subs) {
			val1 = Float.parseFloat(tfTextHolder.getText().substring(0,tfTextHolder.getText().indexOf("-")));
			val2 = Float.parseFloat(tfTextHolder.getText().substring(tfTextHolder.getText().indexOf("-")+1));
			resultat = val1 - val2;
			subs = false;
		}
		tfTextHolder.setText(null);
		tfTextHolder.appendText(""+resultat );
		val1 = 0;
		val2 = 0;
		// reset
		
		
		
	}
	
	
}
