package br.edu.infnet.appMuriloMatins.model.domain;

import jakarta.persistence.*;

import java.util.LinkedList;
import java.util.List;


@Entity
@Table(name = "Cupom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String cliente;
    private String loja;
    private String descricao;
    private float valor;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "cupom_id")
    private List<Pagamento> pagamentos = new LinkedList<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "cupom_id")
    private List<Produto> produtos = new LinkedList<>();

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Cupom() {
    }


    public Cupom(String cliente, String loja, float valor, String descricao) {
        this.descricao = descricao;
        this.valor = valor;
        this.cliente = cliente;
        this.loja = loja;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setPagamentos(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public String getTotalPagamentos() {
        float total = 0;

        for (Pagamento pagamento : pagamentos) {
            total += pagamento.getValor();
        }

        return "Total de pagamentos: R$: " + total;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getLoja() {
        return loja;
    }

    public void setProdutos(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cupom: ");
        sb.append(this.descricao);
        sb.append("; Valor: ");
        sb.append(this.valor);
        sb.append("; Cliente: ");
        sb.append(this.cliente);
        sb.append("; Loja: ");
        sb.append(this.loja);
        sb.append("\n");
        sb.append(getProdutos());
        sb.append("\n");
        sb.append(getPagamentos());


        return sb.toString();
    }
}
