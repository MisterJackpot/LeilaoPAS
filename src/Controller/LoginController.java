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

    private LeilaoController listaLeilao;

    @FXML
    Button btnLgn;

    @FXML
    Button btnLeilao;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../View/Login.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setScene(new Scene(root, 350, 500));
        primaryStage.setResizable(false);
        primaryStage.show();

        btnLgn = new Button();

        btnLgn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                listaLeilao = new LeilaoController();
                try {
                    System.out.println("AQUI");
                    listaLeilao.start(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
