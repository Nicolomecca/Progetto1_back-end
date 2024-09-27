package Multimedia;

public class Immagine extends ElementoMultimediale {
    private int luminosita; // Livello di luminosità

    public Immagine(String titolo, int luminosita) {
        super(titolo); // Inizializzo il titolo tramite il costruttore della superclasse
        this.luminosita = Math.max(luminosita, 0); // Assicura che la luminosità sia non negativa
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita)); // Mostro il titolo e la luminosità
    }

    public void aumentaLuminosita() {
        luminosita++; // Incremento la luminosità
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--; // Decremento la luminosità se maggiore di zero
        }
    }
}