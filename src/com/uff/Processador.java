package com.uff;

import com.uff.boleto.Boleto;
import com.uff.fatura.Fatura;
import com.uff.pagamento.Pagamento;
import com.uff.pagamento.TipoPagamento;

import java.util.List;

public class Processador {
    public static void createPayment(List<Boleto> boletos, Fatura fatura) {
        for (Boleto boleto : boletos) {
            Pagamento pag = new Pagamento(boleto.getValorPago(), boleto.getData(), TipoPagamento.BOLETO);
            fatura.addPagamentoToList(pag);
        }
    }

    public static Boolean checkPaymentAmount(Fatura fatura){
        float amount = 0;
        for (Pagamento pag : fatura.getPagamentos()) {
            amount += pag.getValorPago();
        }
        if (amount >= fatura.getValorTotal()){
            return true;
        }
        return false;
    }
}
