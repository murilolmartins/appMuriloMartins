package br.edu.infnet.appMuriloMatins.model.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "Produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private float valor;
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "cupom_id")
    private Cupom cupom;

    // Default constructor for JPA
    public Produto() {
    }

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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public void setCupom(Cupom cupom) {
        this.cupom = cupom;
    }

    public Cupom getCupom() {
        return cupom;
    }
}