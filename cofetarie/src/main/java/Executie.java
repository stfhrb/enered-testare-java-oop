import mostenire.Client;
import service.CofetarieService;

public class Executie {

    public static void main(String[] args) {
        Client clientTest = Client.builder()
                .adresa("iasi")
                .nume("popescu")
                .prenume("cristi")
                .varsta(29)
                .clientFidel(false)
                .build();


        CofetarieService cofetarieService = new CofetarieService();

        cofetarieService.adaugaClient(clientTest);
        cofetarieService.afiseazaClientiCofetarie();
    }
}
