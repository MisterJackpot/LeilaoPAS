package DTO;

public class LanceDTO {

    private CompradorDTO comprador;
    private double valor;

    public LanceDTO(CompradorDTO comprador, double valor) {
        this.comprador = comprador;
        this.valor = valor;
    }

}
