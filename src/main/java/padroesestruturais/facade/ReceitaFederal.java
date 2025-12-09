package padroesestruturais.facade;

public class ReceitaFederal extends Orgao {

    private static ReceitaFederal receitaFederal = new ReceitaFederal();

    private ReceitaFederal() {};

    public static ReceitaFederal getInstancia() {
        return receitaFederal;
    }
}