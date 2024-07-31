package esercizio;

import java.util.Random;

public class Cliente {
    private long id;
    private int tier;
    private String nomeCliente;

    public Cliente(String nome, int tier) {
        Random random = new Random();
        this.id = random.nextInt(1, 1000);
        this.nomeCliente = nome;
        this.tier = tier;
    }

    
}
