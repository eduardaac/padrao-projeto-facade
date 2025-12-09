package padroesestruturais.facade;

public class Cliente {

    public boolean obterEmprestimo() {
        return ClienteFacade.verificarPendenciasEmprestimo(this);
    }
}