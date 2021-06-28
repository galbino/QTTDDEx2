package com.uff.pagamento;

import com.uff.boleto.Boleto;

import java.util.Date;

public class Pagamento {
    private Double valorPago;
    private Date data;
    private TipoPagamento tipoPagamento;

    public Pagamento(Double valorPago, Date data, TipoPagamento tipo) {
        this.valorPago = valorPago;
        this.data = data;
        this.tipoPagamento = tipo;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
