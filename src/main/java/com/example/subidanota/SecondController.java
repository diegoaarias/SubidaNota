package com.example.subidanota;

import com.example.subidanota.model.Estudiante;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SecondController implements Initializable, EventHandler<ActionEvent> {

    @FXML
    private TextField apellidoDetalle;

    @FXML
    private TextField aprobadoDetalle;

    @FXML
    private TextField correoDetalle;

    @FXML
    private TextField direccionDetalle;

    @FXML
    private TextField nombreDetalle;

    @FXML
    private TextField notaDetalle;

    @FXML
    private TextArea sobreDetalle;

    @FXML
    private TextField telefonoDetalle;

    @FXML
    private Button botonCerrar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        acciones();
    }

    private void acciones() {
        botonCerrar.setOnAction(this);
    }

    public void cargarEstudiante(Estudiante e) {
        nombreDetalle.setText(e.getNombre());
        apellidoDetalle.setText(e.getApellido());
        direccionDetalle.setText(e.getDireccion());
        telefonoDetalle.setText(e.getTelefono());
        correoDetalle.setText(e.getCorreo());
        notaDetalle.setText(e.getNotaMedia().toString());
        if(e.isAprobado(e.getNotaMedia())){
            aprobadoDetalle.setText("Si");
        }else{
            aprobadoDetalle.setText("No");
        }
        sobreDetalle.setText(e.getSobre());
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource()==botonCerrar){
            Stage stage = (Stage) nombreDetalle.getScene().getWindow();
            stage.close();
        }
    }
}
