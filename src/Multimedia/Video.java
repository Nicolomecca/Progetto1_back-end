package Multimedia;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosita;

    // Creo un nuovo Video fornendo titolo, durata, volume e luminosità
    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = Math.max(durata, 1); // Imposto la durata a un minimo di 1
        this.volume = Math.max(volume, 1); // Imposto il volume a un minimo di 1
        this.luminosita = Math.max(luminosita, 0); // Imposto la luminosità a un minimo di 0
    }

    @Override
    public void play() {
        // Riproduco il video stampando il titolo, il volume e la luminosità
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + " " + "*".repeat(luminosita));
        }
    }

    public void abbassaVolume() {
        volume = Math.max(volume - 1, 0);
    }

    public void alzaVolume() {
        volume++; // Incremento il volume di 1
    }

    public void diminuisciLuminosita() {
        luminosita = Math.max(luminosita - 1, 0);
    }

    public void aumentaLuminosita() {
        luminosita++; // Incremento la luminosità di 1
    }
}