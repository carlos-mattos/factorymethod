import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoRacaoTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IRacao servico = ServicoRacao.obterServico("MarcaInexistente");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("marca inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IRacao servico = ServicoRacao.obterServico("MarcaQueNaoImplementa");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("marca inválida", e.getMessage());
        }
    }

}