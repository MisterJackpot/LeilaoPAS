package DTO;

import java.util.ArrayList;

public class ProdutoDTO {

    private String nome;
    private ArrayList<LanceDTO> lances;

    public ProdutoDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<LanceDTO> getLances() {
        return lances;
    }

    public void setLances(ArrayList<LanceDTO> lances) {
        this.lances = lances;
    }
}
