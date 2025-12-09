package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPendenciaSerasaEmprestimo() {
        Cliente cliente = new Cliente();
        Serasa.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.obterEmprestimo());
    }

    @Test
    void deveRetornarPendenciaSPCEmprestimo() {
        Cliente cliente = new Cliente();
        SPC.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.obterEmprestimo());
    }

    @Test
    void deveRetornarPendenciaReceitaFederalEmprestimo() {
        Cliente cliente = new Cliente();
        ReceitaFederal.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.obterEmprestimo());
    }

    @Test
    void deveRetornarClienteSemPendenciaEmprestimo() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.obterEmprestimo());
    }
}