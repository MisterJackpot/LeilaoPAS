package Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LeilaoController extends Application {

    @Override
    public void start(Stage window) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../View/ListaLeilao.fxml"));
        Scene scene =  new Scene(root, 350 ,500);
        window.setScene(scene);
        window.show();
    }


}
