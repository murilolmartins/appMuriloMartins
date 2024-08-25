package br.edu.infnet.appMuriloMatins.model.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PagamentoCartao")
public class PagamentoCartao extends Pagamento {

    private String banco;
    private String numeroCartao;
    private boolean parcelado;

    public PagamentoCartao() {
    }

    public PagamentoCartao(String descricao, float valor, String banco, String numeroCartao,
                           boolean parcelado) {
        super(descricao, valor);
        this.banco = banco;
        this.numeroCartao = numeroCartao;
        this.parcelado = parcelado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("; Banco:");
        sb.append(this.banco);
        sb.append("; Número do cartão:");
        sb.append(this.numeroCartao);
        sb.append("; Parcelado:");
        sb.append(this.parcelado);

        return sb.toString();
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public boolean isParcelado() {
        return parcelado;
    }

    public void setParcelado(boolean parcelado) {
        this.parcelado = parcelado;
    }
}
