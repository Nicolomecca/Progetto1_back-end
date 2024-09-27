package Multimedia;

public class Immagine extends ElementoMultimediale implements Riproducibile {
  private int luminosità ;

  public Immagine(String titolo, int luminosità) {
      super(titolo, TipoElementoMultimediale.IMMAGINE);
      setLuminosità(luminosità);
  }
    public void setLuminosità(int luminosità) {
        if (luminosità >= 0) { // La luminosità può essere zero o positiva
            this.luminosità = luminosità;
        } else {
            this.luminosità = luminosità;
            System.out.println("La luminosità deve essere zero o positiva.");
        }
    }

    public void show() {
        System.out.println(titolo + "*" + "*".repeat(luminosità));
    }

    @Override
    public int getDurata() {
        System.out.println("Duarata non necessaria.");;
        return 0;
    }

    @Override
    public void play() {
        // Implemento il metodo anche se l'immagine non è riproducile
        System.out.println("Immagine non riproducibile.");
    }

}
