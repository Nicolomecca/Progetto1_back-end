package Multimedia;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata ;
    private int volume ;
    private int luminosità;

    public Video(String titolo, int durata , int volume , int luminosità) {
        super(titolo, TipoElementoMultimediale.VIDEO);
        setDurata(durata);
        setVolume(volume);
        setLuminosità(luminosità);
    }
    public void setVolume(int volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            this.volume = 0; // ho Impostato il volume a zero se non è positivo
            System.out.println("Il volume deve essere positivo.");
        }
    }

    public void setDurata(int durata) {
        if (durata > 0) {
            this.durata = durata;
        } else {
            this.durata = 0; // ho Impostato la durata a zero se non è positivo
            System.out.println("Errore: La durata deve essere positiva.");
        }
    }

    public void setLuminosità(int luminosità) {
        if (luminosità > 0) {
            this.luminosità = luminosità;
        } else {
            this.luminosità = 0; // ho Impostato la luminosità a zero se non è positivo
       System.out.println ("La luminosità deve essere positiva.");
        }
    }


    @Override
    public int getDurata() {
        return 0;
    }

    @Override
    public void play() {

    }
}
