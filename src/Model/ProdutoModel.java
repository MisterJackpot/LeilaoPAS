package Model;

import BancoMocado.BancoMocado;
import DTO.ProdutoDTO;

public class ProdutoModel {

    public void adicionarProduto(ProdutoDTO produto){
        BancoMocado.adicionarProduto(produto);
    }

}
