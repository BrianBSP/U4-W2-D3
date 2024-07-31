package esercizio;

import enums.Status;
import enums.Tier;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // creazione prodotti in magazzino
        Prodotto prodotto1 = new Prodotto("Avvocato canaglia", "Books", 150);
        Prodotto prodotto2 = new Prodotto("Pannolino", "Baby", 15);
        Prodotto prodotto3 = new Prodotto("Hot Wheels", "Boys", 180);
        Prodotto prodotto4 = new Prodotto("Peppa Pig", "Baby", 10);
        Prodotto prodotto5 = new Prodotto("La ragazza del treno", "Books", 110);
        Prodotto prodotto6 = new Prodotto("Un fuoco che brucia lento", "Books", 90);

        // creazione clienti
        Cliente cliente1 = new Cliente("Aldo Baglio", Tier.LIVELLO1);
        Cliente cliente2 = new Cliente("Giovanni Storti", Tier.LIVELLO2);
        Cliente cliente3 = new Cliente("Giacomo Poretti", Tier.LIVELLO2);
        Cliente cliente4 = new Cliente("Checco Zalone", Tier.LIVELLO3);

        // creazione ordini
        Ordine ordine1 = new Ordine(Status.SPEDITO, LocalDate.of(2024, 7, 1), LocalDate.now(), Arrays.asList(prodotto1, prodotto2, prodotto3, prodotto6), cliente1);
        Ordine ordine2 = new Ordine(Status.CONSEGNATO, LocalDate.of(2024, 7, 28), LocalDate.of(2024, 7, 31), Arrays.asList(prodotto1, prodotto4), cliente2);
        Ordine ordine3 = new Ordine(Status.CONSEGNATO, LocalDate.of(2024, 7, 28), LocalDate.of(2024, 7, 31), Arrays.asList(prodotto1, prodotto3, prodotto5), cliente3);
        Ordine ordine4 = new Ordine(Status.CONSEGNATO, LocalDate.of(2024, 7, 28), LocalDate.of(2024, 7, 31), Arrays.asList(prodotto2, prodotto4), cliente4);

        // lista prodotti
        List<Prodotto> catalogoProdotti = List.of(prodotto1, prodotto2, prodotto3, prodotto4, prodotto5, prodotto6);

        // lista ordini
        List<Ordine> ordini = List.of(ordine1, ordine2, ordine3, ordine4);

        // lista clienti
        List<Cliente> clienti = List.of(cliente1, cliente2, cliente3, cliente4);

        // es1 ottenere una lista di prodotti BOOKS con prezzo > 100
        List<Prodotto> books = catalogoProdotti
                .stream()
                .filter(prodotto -> "Books".equals(prodotto.getCategoria()) && prodotto.getPrezzo() > 100)
                .toList();
        System.out.println("-------- Es 1 -------");
        System.out.println("Prodotti appartenenti alla categoria BOOKS con prezzo superiore a € 100");
        books.forEach(System.out::println);

        // es2 ottenere una lista di ordini con prodotti che appartengono alla categoria BABY
        List<Ordine> listaOrdiniBaby = ordini
                .stream()
                .filter(ordine -> ordine
                        .getProdotti()
                        .stream()
                        .anyMatch(prodotto -> "Baby"
                                .equals(prodotto.getCategoria())))
                .toList();
        System.out.println("----- Es2 -----");
        System.out.println("liste ordini con prodotti appartenenti alla categoria baby");
        listaOrdiniBaby.forEach(System.out::println);

        // ottenere una lista di prodotti che appartengono alla categoria BOYS e fare sconto 10%
        List<Prodotto> prodottiBoys = catalogoProdotti
                .stream()
                .filter(prodotto -> "Boys"
                        .equals(prodotto
                                .getCategoria()))
                .peek(prodotto -> prodotto
                        .setPrezzo(prodotto
                                .getPrezzo() * 0.9))
                .toList();
        System.out.println("------ Es3 -------");
        System.out.println("lista prodotti categoria BOYS con sconto 10%");
        prodottiBoys.forEach(System.out::println);

        // es4 ottenere una lista di prodotti ordinati da clienti di livello 2 tra l'1-6-2024 e il 31-7-2024
        List<Prodotto>

    }
}