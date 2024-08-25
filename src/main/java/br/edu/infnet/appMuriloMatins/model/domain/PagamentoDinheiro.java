package br.edu.infnet.appMuriloMatins.model.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PagamentoDinheiro")
public class PagamentoDinheiro extends Pagamento{

    private float troco;
    private float valorPago;

    public PagamentoDinheiro() {
    }

    public PagamentoDinheiro(String descricao, float valor , float troco, float valorPago) {
        super(descricao, valor);
        this.troco = troco;
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("; Troco:");
        sb.append(this.troco);
        sb.append("; Valor Pago:");
        sb.append(this.valorPago);

        return sb.toString();
    }


}
