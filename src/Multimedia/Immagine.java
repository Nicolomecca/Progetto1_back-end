package Multimedia;

public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = Math.max(luminosita, 0);
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }
}
