package padroesestruturais.facade;

public class SPC extends Orgao {

    private static SPC spc = new SPC();

    private SPC() {};

    public static SPC getInstancia() {
        return spc;
    }
}