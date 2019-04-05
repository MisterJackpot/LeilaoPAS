package Model;

import BancoMocado.BancoMocado;
import DTO.LanceDTO;
import DTO.ProdutoDTO;

import java.util.ArrayList;

public class LeilaoModel {

    private ProdutoModel produtoModel = new ProdutoModel();

    public void adicionarProduto(String nome){
        produtoModel.adicionarProduto(nome);
    }

    public void removerProduto(String nome){
        produtoModel.removerProduto(nome);
    }

    public ArrayList<ProdutoDTO> listarProdutos(){
        return produtoModel.listarProdutos();
    }

    public ArrayList<LanceDTO> listarLances(){
        return BancoMocado.listarLances();
    }

}
