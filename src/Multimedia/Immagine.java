package Multimedia;

public class Immagine extends ElementoMultimediale {
    private int luminosita; // Livello di luminosità

    public Immagine(String titolo, int luminosita) {
        super(titolo); // Inizializza il titolo tramite il costruttore della superclasse
        this.luminosita = Math.max(luminosita, 0); // Assicura che la luminosità sia non negativa
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita)); // Mostra il titolo e la luminosità
    }

    public void aumentaLuminosita() {
        luminosita++; // Incrementa la luminosità
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--; // Decrementa la luminosità se maggiore di zero
        }
    }
}