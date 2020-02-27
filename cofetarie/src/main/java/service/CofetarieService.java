package service;

import model.Client;
import model.Cofetarie;
import model.EvenimentSpecial;
import model.ProdusCofetarie;

public class CofetarieService {
    private Cofetarie cofetariaMea;

    public void adaugaClient(Client clientNou) {
        cofetariaMea.getListaClienti().add(clientNou);
    }

    public void adaugaProdusCofetarie(ProdusCofetarie produsNou) {
        cofetariaMea.getListaProduseCofetarie().add(produsNou);
    }

    public void adaugaEvenimentSpecial(EvenimentSpecial evenimentNou) {
        cofetariaMea.getListaEvenimenteSpeciale().add(evenimentNou);
    }

    public void afiseazaClientiCofetarie() {
        for (Client clientDinCofetarie : cofetariaMea.getListaClienti()) {
            System.out.println(clientDinCofetarie);
        }
    }

    public void afiseazaNumarClientiExistenti() {
        System.out.println("Cofetaria mea are " +
                cofetariaMea.getListaClienti().size() + " clienti");
    }

    public void afiseazaListaProduseCofetarie() {
        for (ProdusCofetarie produsDinCofetarie : cofetariaMea.getListaProduseCofetarie()) {
            System.out.println(produsDinCofetarie);
        }
    }

    public void afiseazaNumarProduseCofetarieExistente() {
        System.out.println("Cofetarie mea are " +
                cofetariaMea.getListaProduseCofetarie().size() + " produse");
    }

    public void afiseazaListaEvenimenteCofetarie() {
        for (EvenimentSpecial evenimentDinCofetarie : cofetariaMea.getListaEvenimenteSpeciale()) {
            System.out.println(evenimentDinCofetarie);
        }
    }

    public void afiseazaEvenimenteCofetarie() {
        System.out.println("Cofetarie mea are " +
                cofetariaMea.getListaEvenimenteSpeciale().size() + " evenimente");
    }
}
