import mostenire.Masina;
import org.junit.jupiter.api.Test;

public class TesteMasina {

    @Test
    public void testAsigurareMasinaMethod() {
        Masina m = new Masina();
        m.asigurareMasina();
    }

    @Test
    public void testVechimeMasinaMethod() {
        Masina m = new Masina();
        m.setAnulFabricatiei(2017);
        m.calculeazaVechimeMasina();
    }
}
