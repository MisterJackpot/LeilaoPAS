package Controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.io.IOException;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;

public class LoginController extends Application {

    private VendedorController vendedorController;
    private Stage pS;

    @FXML
    Button btnLgn;

    @FXML
    Button btnLeilao;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        pS = primaryStage;
        pS.setTitle("Hello World!");
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pS.setScene(new Scene(root, 350, 500));
        pS.setResizable(false);
        pS.show();

    }

    @FXML
    private void login(){
        vendedorController = new VendedorController();
        try {
            System.out.println("AQUI");
            vendedorController.start( (Stage) btnLgn.getScene().getWindow());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
