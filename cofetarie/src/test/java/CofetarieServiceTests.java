import mostenire.Client;
import mostenire.EvenimentSpecial;
import org.junit.jupiter.api.Test;
import service.CofetarieService;

public class CofetarieServiceTests {
    CofetarieService cofetarieServiceTest = new CofetarieService();


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
        cofetarieServiceTest.adaugaClient(clientTest);
    }

    @Test
    public void testAfisareClient() {
        cofetarieServiceTest.afiseazaClientiCofetarie();
    }

    @Test
    public void testEveniment() {

        cofetarieServiceTest.adaugaEvenimentSpecial(evenimentTest);
        cofetarieServiceTest.afiseazaEvenimenteCofetarie();
    }
}
