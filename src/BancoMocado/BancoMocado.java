package BancoMocado;

import DTO.CompradorDTO;
import DTO.ProdutoDTO;
import DTO.VendedorDTO;

import java.util.ArrayList;

public class BancoMocado {

    private static ArrayList<ProdutoDTO> produtos = new ArrayList<>();
    private static ArrayList<CompradorDTO> compradores = new ArrayList<>();
    private static ArrayList<VendedorDTO> vendedores = new ArrayList<>();

    public static void adicionarProduto(ProdutoDTO produto){
        produtos.add(produto);
    }

    public static ArrayList<ProdutoDTO> listarProdutos(){
        ArrayList<ProdutoDTO> retorno = (ArrayList<ProdutoDTO>) produtos.clone();
        return retorno;
    }

    public void crudComprador(CompradorDTO comprador){
        return;
    }
    public void crudVendedor(VendedorDTO vendedor){
        return;
    }

}
