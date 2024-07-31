package esercizio;

import java.util.Random;

public class Prodotto {
    private long id;
    private String nome;
    private String categoria;
    private double prezzo;

    // costruttori
    public Prodotto(String nome, String categoria, double prezzo) {
        Random random = new Random();
        this.id = random.nextLong(1, 1000);
        this.nome = nome;
        this.categoria = categoria;
        this.prezzo = prezzo;
    }

    // getter e setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "----Prodotto----\n{" +
                "id = " + id +
                ", \nnome = '" + nome + '\'' +
                ", \ncategoria = '" + categoria + '\'' +
                ", \nprezzo = " + prezzo +
                '}';
    }

}
