package model.domain;

import java.util.LinkedList;
import java.util.List;

public class Cupom {
    private String cliente;
    private String loja;
    private final String descricao;
    private final float valor;
    private List<Pagamento> pagamentos = new LinkedList<>();

    public Cupom(String cliente, String loja, float valor, String descricao) {
        this.descricao = descricao;
        this.valor = valor;
        this.cliente = cliente;
        this.loja = loja;
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

        return sb.toString();
    }
}
