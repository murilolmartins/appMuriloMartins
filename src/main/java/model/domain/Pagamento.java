package model.domain;

public abstract class Pagamento {

    private int id;
    private float valor;
    private String descricao;

    public Pagamento(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pagamento: ");
        sb.append(this.descricao);
        sb.append("; Total: ");
        sb.append(this.valor);

        return sb.toString();
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


}
