package padroesestruturais.facade;

public class ClienteFacade {

    public static boolean verificarPendenciasEmprestimo(Cliente cliente) {
        if (SPC.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Serasa.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (ReceitaFederal.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}