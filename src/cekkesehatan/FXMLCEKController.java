/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Xaddam
 */
public class FXMLCEKController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private RadioButton laki;
    @FXML
    private ToggleGroup pilihanjk;
    @FXML
    private RadioButton cewe;
    @FXML
    private JFXTextField editnama;
    @FXML
    private JFXTextField editberat;
    @FXML
    private JFXTextField edittinggi;
    @FXML
    private JFXTextArea edithasil;
    @FXML
    private JFXTextField editideal;
    @FXML
    private JFXTextArea editsaran;
    @FXML
    private JFXButton editproses;
    @FXML
    private JFXButton editreset;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void hasil(MouseEvent event) {
    }

    @FXML
    private void saran(MouseEvent event) {
    }

    @FXML
    private void proses(ActionEvent event) {
        String nama = editnama.getText();
        int berat = Integer.parseInt(editberat.getText());
        int tinggi = Integer.parseInt(edittinggi.getText());
        String kelamin;
        int ideal = 0; 
        String hasil = "";
        String saran = "";
        
        
        if (laki.isSelected()) 
            kelamin = "laki-laki";
        
        else if (cewe.isSelected())
            kelamin = "perempuan";
        else
            kelamin = "";
        
        if (laki.isSelected())
            ideal = tinggi - 110;
        else if (cewe.isSelected())
            ideal = tinggi - 100;
        
        if (berat == ideal) {
            hasil = "Ideal";
            saran = "pertahankan";
        } else if (berat >= ideal){
            hasil = "gendut";
            saran = "kurangi makan";
            
        }else if (berat <= ideal){
            hasil = "kurus";
            saran = "Makan yang banyak bro";
    }
       edithasil.setText("Nama = "+nama+"\nBerat badan = "+berat+"\nTinggi badan = "+tinggi+"\nJenis kelamin = "+kelamin+"\nBerat badan anda = " +hasil);
       editideal.setText(""+ideal);
       editsaran.setText("saran = "+saran);
    }

    @FXML
    private void reset(ActionEvent event) {
        edithasil.setText("");
        editnama.setText("");
        editberat.setText("");
        edittinggi.setText("");
        editideal.setText("");
        laki.setSelected(false);
        cewe.setSelected(false);
        editsaran.setText("");
    }
    
}
