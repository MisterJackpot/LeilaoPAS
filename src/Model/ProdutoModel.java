package Model;

import BancoMocado.BancoMocado;
import DTO.ProdutoDTO;

import java.util.ArrayList;

public class ProdutoModel {

    public void adicionarProduto(String nome){
        ProdutoDTO produto = new ProdutoDTO(nome);
        BancoMocado.adicionarProduto(produto);
    }

    public ArrayList<ProdutoDTO> listarProdutos(){
        return BancoMocado.listarProdutos();
    }

    public void removerProduto(String nome){
        ArrayList<ProdutoDTO> produtos = listarProdutos();

        for(ProdutoDTO p : produtos){
            if(p.getNome().equalsIgnoreCase(nome)){
                BancoMocado.removerProduto(p);
            }
        }
    }

}
