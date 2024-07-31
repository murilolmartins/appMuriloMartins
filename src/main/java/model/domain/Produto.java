package model.domain;

public class Produto {
    private String nome;
    private float valor;
    private int quantidade;

    public Produto(String nome, float valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto: ");
        sb.append(this.nome);
        sb.append("; Valor: ");
        sb.append(this.valor);
        sb.append("; Quantidade: ");
        sb.append(this.quantidade);

        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
