import model.Client;
import model.EvenimentSpecial;
import org.junit.jupiter.api.Test;
import service.CofetarieService;

public class CofetarieServiceTests {
    CofetarieService cofetarieTest = new CofetarieService();

    Client clientTest = Client.builder()
            .adresa("iasi")
            .nume("popescu")
            .prenume("cristi")
            .varsta(29)
            .clientFidel(false)
            .build();

    EvenimentSpecial evenimentTest = EvenimentSpecial.builder()
            .durataEveniment(90)
            .numeEveniment("Petrecere copii")
            .pretEveniment(999.99)
            .tematicaEveniment("Arlechino")
            .build();


    @Test
    public void testAdaugareClient() {
        cofetarieTest.adaugaClient(clientTest);
    }

    @Test
    public void testAfisareClient() {
        cofetarieTest.afiseazaClientiCofetarie();
    }

    @Test
    public void testEveniment() {

        cofetarieTest.adaugaEvenimentSpecial(evenimentTest);
        cofetarieTest.afiseazaEvenimenteCofetarie();
    }
}
