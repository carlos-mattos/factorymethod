import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuatreeTest {

    @Test
    void deveVenderQuatree() {
        IRacao racao = ServicoRacao.obterServico("Quatree");
        float quantidade = 2;

        assertEquals("Foi vendido "+quantidade+" sacos de racao da Quatree", racao.vender(2));
    }

    @Test
    void deveReporQuatree() {
        IRacao racao = ServicoRacao.obterServico("Quatree");
        float quantidade = 3;

        assertEquals("Foi reposto "+quantidade+" sacos de racao da Quatree", racao.repor(3));
    }

}