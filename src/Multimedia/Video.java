package Multimedia;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = Math.max(durata, 1);
        this.volume = Math.max(volume, 1);
        this.luminosita = Math.max(luminosita, 0);
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + " " + "*".repeat(luminosita));
        }
    }

    public void abbassaVolume() {
        volume = Math.max(volume - 1, 0);
    }

    public void alzaVolume() {
        volume++;
    }

    public void diminuisciLuminosita() {
        luminosita = Math.max(luminosita - 1, 0);
    }

    public void aumentaLuminosita() {
        luminosita++;
    }
}