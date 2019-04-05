package Controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VendedorController extends Application {

    @FXML
    ListView listaItens;

    @FXML
    Button btnAddItem;

    @FXML
    TextField fieldNome;

    @Override
    public void start(Stage window) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../View/Vendedor.fxml"));
        window.setScene(new Scene(root));
        window.show();
    }

    @FXML
    private boolean adicionarItem(){
        System.out.println(fieldNome.getCharacters());
        return true;
    }

}
