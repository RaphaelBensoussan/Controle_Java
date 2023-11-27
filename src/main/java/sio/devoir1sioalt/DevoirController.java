package sio.devoir1sioalt;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.ResourceBundle;

public class DevoirController implements Initializable {

    @FXML
    private Button btnExo1;
    @FXML
    private AnchorPane apExo1;
    @FXML
    private AnchorPane apExo2;
    @FXML
    private AnchorPane apExo3;
    @FXML
    private Button btnExo2;
    @FXML
    private Slider sldNbLignes;
    @FXML
    private TextArea txtTriangle;
    @FXML
    private Button btnExo3;
    @FXML
    private Button btnDessiner;
    @FXML
    private TextField txtNbJours;
    @FXML
    private TextField txtNbEleves;
    @FXML
    private TextField txtCoutGlobal;
    @FXML
    private Button btnCalculer;
    @FXML
    private Button btnJouer;
    @FXML
    private TextArea txtResultatsTirages;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        apExo1.toFront();
    }

    @FXML
    public void btnExosMenuClicked(Event event)
    {
        if(event.getSource() == btnExo1)
        {
            apExo1.toFront();
        }
        else if(event.getSource() == btnExo2)
        {
            apExo2.toFront();
        }
        else
        {
            apExo3.toFront();;
        }
    }

    // Exercice n°1
    @FXML
    public void btnCalculerClicked(Event event)
    {
        if (txtNbJours.getText().compareTo("") == 0)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Choix du nombre de jours");
            alert.setHeaderText("");
            alert.setContentText("Veuillez saisir le nombre de jours");
            alert.showAndWait();
        }
        else if (txtNbEleves.getText().compareTo("") == 0)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Choix du nombre d'élèves");
            alert.setHeaderText("");
            alert.setContentText("Veuillez saisir le nombres d'élèves");
            alert.showAndWait();
        }
        else
        {
            double cout = 0;
            int Nbrjours = Integer.parseInt(txtNbJours.getText());
            int Nbreleves = Integer.parseInt(txtNbEleves.getText());
            double Coutglobal = Integer.parseInt(txtCoutGlobal.getText());

            if (Nbreleves <= 25)
            {
                Coutglobal = Nbreleves * 67.30 + (Nbreleves * 3.5 * Nbrjours);
            }
            else
            {
                Coutglobal = Nbreleves * 61 + (Nbreleves * 3.5 * Nbrjours);
            }

            if (Nbreleves <= 30)
            {
                cout = Coutglobal + (Nbreleves * 4.75 * Nbrjours);
            }
            if (Nbreleves>=31 && Nbreleves<=35)
            {
                cout = Coutglobal + (Nbreleves * 4 * Nbrjours);
            }
            else
            {
                cout = Coutglobal + (Nbreleves * 3.5 * Nbrjours);
            }
            btnCalculer.setText(String.valueOf(cout)+"€");
        }
    }

    // Exercice n°2
    @FXML
    public void btnDessinerClicked(Event event)
    {
        txtTriangle.setText("");
        for ( int l = 1; l <= sldNbLignes.getValue(); l++){
            for ( int m = 1+l; m < sldNbLignes.getValue()+2; m++){
                txtTriangle.setText(txtTriangle.getText() + " " + "1");
            }
            txtTriangle.setText(txtTriangle.getText() + "\n");
            for ( int m = 1+l; m < sldNbLignes.getValue()+1; m++){
                txtTriangle.setText(txtTriangle.getText() + " " + "2");
            }
            txtTriangle.setText(txtTriangle.getText() + "\n");
            for ( int m = 1+l; m < sldNbLignes.getValue(); m++){
                txtTriangle.setText(txtTriangle.getText() + " " + "3");
            }
            txtTriangle.setText(txtTriangle.getText() + "\n");
            for ( int m = 1+l; m < sldNbLignes.getValue()-1; m++){
                txtTriangle.setText(txtTriangle.getText() + " " + "4");
            }
            txtTriangle.setText(txtTriangle.getText() + "\n");
            for ( int m = 1+l; m < sldNbLignes.getValue()-2; m++){
                txtTriangle.setText(txtTriangle.getText() + " " + "5");
            }
            txtTriangle.setText(txtTriangle.getText() + "\n");
            for ( int m = 1+l; m < sldNbLignes.getValue()-3; m++){
                txtTriangle.setText(txtTriangle.getText() + " " + "6");
            }
            txtTriangle.setText(txtTriangle.getText() + "\n");
            for ( int m = 1+l; m < sldNbLignes.getValue()-4; m++){
                txtTriangle.setText(txtTriangle.getText() + " " + "7");
            }
            txtTriangle.setText(txtTriangle.getText() + "\n");
            for ( int m = 1+l; m < sldNbLignes.getValue()-5; m++){
                txtTriangle.setText(txtTriangle.getText() + " " + "8");
            }
            txtTriangle.setText(txtTriangle.getText() + "\n");
            for ( int m = 1+l; m < sldNbLignes.getValue()-6; m++){
                txtTriangle.setText(txtTriangle.getText() +" "+"9");
            }
            txtTriangle.setText(txtTriangle.getText() + "\n");
            for ( int m = 1+l; m < sldNbLignes.getValue()-7; m++){
                txtTriangle.setText(txtTriangle.getText() + " " +"10");
            }
            txtTriangle.setText(txtTriangle.getText() + "\n");
        }
    }

    // Exercice n°3
    @FXML
    public void btnJouerClicked(Event event)
    {
        // Manque de temps

    }
}