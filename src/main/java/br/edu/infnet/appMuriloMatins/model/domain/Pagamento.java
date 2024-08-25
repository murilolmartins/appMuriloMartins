package br.edu.infnet.appMuriloMatins.model.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "Pagamento")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float valor;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "cupom_id")
    private Cupom cupom;

    public Pagamento() {
    }

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

    public void setCupom(Cupom cupom) {
        this.cupom = cupom;
    }

    public Cupom getCupom() {
        return cupom;
    }

}
