package Controller;

import DTO.ProdutoDTO;
import Model.LeilaoModel;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

public class VendedorController extends Application {

    private static ObservableList<String> lista;
    private static LeilaoModel leilaoModel;

    @FXML
    ListView listaItens;

    @FXML
    Button btnAddItem;

    @FXML
    TextField fieldNome;

    @Override
    public void start(Stage window) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../View/Vendedor.fxml"));
        lista = FXCollections.<String>observableArrayList();
        leilaoModel = new LeilaoModel();
        window.setScene(new Scene(root));
        window.show();
    }

    private void listarItens(){
        lista.clear();
        for (ProdutoDTO p:leilaoModel.listarProdutos()) {
            lista.add(p.getNome());
        }
        listaItens.setItems((ObservableList) lista);
    }

    @FXML
    private boolean adicionarItem(){
        leilaoModel.adicionarProduto(fieldNome.getCharacters().toString());
        fieldNome.clear();
        listarItens();
        return true;
    }

}
