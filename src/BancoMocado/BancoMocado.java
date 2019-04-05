package BancoMocado;

import DTO.CompradorDTO;
import DTO.LanceDTO;
import DTO.ProdutoDTO;
import DTO.VendedorDTO;

import java.util.ArrayList;

public class BancoMocado {

    private static ArrayList<ProdutoDTO> produtos = new ArrayList<>();
    private static ArrayList<CompradorDTO> compradores = new ArrayList<>();
    private static ArrayList<VendedorDTO> vendedores = new ArrayList<>();
    private static ArrayList<LanceDTO> lances = new ArrayList<>();

    public static void adicionarProduto(ProdutoDTO produto){
        produtos.add(produto);
    }

    public static ArrayList<ProdutoDTO> listarProdutos() {
        return produtos;
    }

    public static void removerProduto(ProdutoDTO produto){
        produtos.remove(produto);
    }

    public static void adicionarLance(LanceDTO lance){
        lances.add(lance);
    }

    public static ArrayList<LanceDTO> listarLances() {
        return lances;
    }

}
