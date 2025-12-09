package padroesestruturais.facade;

public class Serasa extends Orgao {

    private static Serasa serasa = new Serasa();

    private Serasa() {};

    public static Serasa getInstancia() {
        return serasa;
    }
}