package src.main.java;

public abstract class Hamburguer {

    protected String descricao = "Hambúrguer desconhecido";

    public String getDescricao() {
        return descricao;
    }

    public abstract float getPreco();
}