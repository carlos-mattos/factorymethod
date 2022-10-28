import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiskasTest {

    @Test
    void deveVenderWhiskas() {
        IRacao racao = ServicoRacao.obterServico("Whiskas");
        float quantidade = 2;

        assertEquals("Foi vendido "+quantidade+" sacos de racao da Whiskas", racao.vender(2));
    }

    @Test
    void deveReporWhiskas() {
        IRacao racao = ServicoRacao.obterServico("Whiskas");
        float quantidade = 3;

        assertEquals("Foi reposto "+quantidade+" sacos de racao da Whiskas", racao.repor(3));
    }

}