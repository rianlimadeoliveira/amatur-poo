package br.ufrr.dcc.projeto.excecoes;

/** Lançada quando alguém tenta ocupar um assento que já está ocupado. */
public class AssentoOcupadoException extends Exception {
    
    private final int numeroPoltrona;
    
    public AssentoOcupadoException(int numeroPoltrona) {
        super("O assento" + numeroPoltrona + "já está ocupado");
        this.numeroPoltrona = numeroPoltrona;
    }
    
    public int getNumeroPoltrona() {
        return numeroPoltrona;
    }
}