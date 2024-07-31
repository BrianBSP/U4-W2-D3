package esercizio;

import java.time.LocalDate;
import java.util.List;

public class Ordine {
    private long id;
    private String status;
    private LocalDate dataOrdine;
    private LocalDate dataSpedizione;
    private List<Prodotto> prodotti;
    private Cliente cliente;

    public Ordine(String status, LocalDate dataOrdine, LocalDate dataSpedizione, List<Prodotto> prodotti, Cliente cliente) {
        this.status = status;
        this.dataOrdine = dataOrdine;
        this.dataSpedizione = dataSpedizione;
        this.prodotti = prodotti;
        this.cliente = cliente;
    }

}
