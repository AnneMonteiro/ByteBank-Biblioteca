import Modelo.Conta;
import Modelo.ContaCorrente;

public class TesteBiblioteca {

    public static void main(String[] args) {

        Conta c = new ContaCorrente(123,555);
          c.deposita(200.3);
        System.out.println(c.getSaldo());

    }

}
