package fatura;

import com.uff.Processador;
import com.uff.boleto.Boleto;
import com.uff.fatura.Fatura;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProcessadorTest {
    Processador processador;
    Fatura fatura;
    List<Boleto> boletoListFull;
    List<Boleto> boletoListIncomplete;

    @BeforeEach
    public void startUp(){
        processador = new Processador();
        fatura = new Fatura(new Date(), 100.00, "Gustavo");
        Boleto boleto = new Boleto("1", new Date(), 20.0);
        Boleto boletoTwo = new Boleto("2", new Date(), 70.0);
        Boleto boletoThree = new Boleto("3", new Date(), 10.0);
        boletoListFull = new ArrayList<>();
        boletoListIncomplete = new ArrayList<>();

        boletoListFull.add(boleto);
        boletoListIncomplete.add(boleto);
        boletoListFull.add(boletoTwo);
        boletoListIncomplete.add(boletoTwo);
        boletoListFull.add(boletoThree);

    }

    @DisplayName("Testa a criação de pagamentos")
    public void TestCreatePayment(){
        processador.createPayment(boletoListFull, fatura);
        Assertions.assertFalse(fatura.getPagamentos().isEmpty());
    }

    @DisplayName("Testa se a soma dos valores dos boletos alcançou o valor da fatura, caso sim")
    public void TestCheckAmountTrue(){
        processador.createPayment(boletoListFull, fatura);
        Assertions.assertTrue(processador.checkPaymentAmount(fatura));
    }

    @DisplayName("Testa se a soma dos valores dos boletos alcançou o valor da fatura, caso não")
    public void TestCheckAmountFalse(){
        processador.createPayment(boletoListIncomplete, fatura);
        Assertions.assertFalse(processador.checkPaymentAmount(fatura));
    }

}
