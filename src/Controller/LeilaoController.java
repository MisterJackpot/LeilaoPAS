package Controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LeilaoController extends Application {

    @Override
    public void start(Stage window) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../View/ListaLeilao.fxml"));
        window.setScene(new Scene(root));
        window.show();
    }

    @FXML
    private void test(){
        System.out.println("CHEGUEI");
    }


}
