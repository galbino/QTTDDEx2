package com.uff.fatura;

import com.uff.pagamento.Pagamento;

import java.util.Date;
import java.util.List;

public class Fatura {
    private Date data;
    private Double valorTotal;
    private String nomeDoCliente;
    private FaturaStatus faturaStatus;
    private List<Pagamento> pagamentos;

    public Fatura(Date data, Double valorTotal, String nomeDoCliente) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeDoCliente = nomeDoCliente;
        this.faturaStatus = FaturaStatus.NAO_PAGA;
    }

    public FaturaStatus getFaturaStatus() {
        return faturaStatus;
    }

    public void setFaturaStatus(FaturaStatus faturaStatus) {
        this.faturaStatus = faturaStatus;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
    public void addPagamentoToList(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }
}
