import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;


public class Controller {

    public TextField rawDataInputPATH;
    public Button browseButton;
    public TextField outputDirectoryTextField;
    public Button setOutputButton;
    public TextField neuralNetworkTextField;
    public Button neuralNetworkButton;

    @FXML
    private void openFileChooser(ActionEvent actionEvent){

        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {

           // selectedFile.getAbsolutePath();
            rawDataInputPATH.setText(selectedFile.getAbsolutePath());
        }
    }

    @FXML
    private void setOutputDirectory(ActionEvent actionEvent){

        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog(null);

        if (selectedDirectory != null) {
            outputDirectoryTextField.setText(selectedDirectory.getPath());
        }
    }

    @FXML
    private void setNeuralNetworkDirectory(ActionEvent actionEvent){

        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog(null);

        if (selectedDirectory != null) {
            neuralNetworkTextField.setText(selectedDirectory.getPath());
        }
    }
}

