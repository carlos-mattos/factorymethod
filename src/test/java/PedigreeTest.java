import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedigreeTest {

    @Test
    void deveVenderQuatree() {
        IRacao racao = ServicoRacao.obterServico("Pedigree");
        float quantidade = 2;

        assertEquals("Foi vendido "+quantidade+" sacos de racao da Pedigree", racao.vender(2));
    }

    @Test
    void deveReporQuatree() {
        IRacao racao = ServicoRacao.obterServico("Pedigree");
        float quantidade = 3;

        assertEquals("Foi reposto "+quantidade+" sacos de racao da Pedigree", racao.repor(3));
    }

}