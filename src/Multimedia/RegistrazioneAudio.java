package Multimedia;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, TipoElementoMultimediale.AUDIO);
        setDurata(durata);
        setVolume(volume);

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

    @Override
    public int getDurata() {
        return durata;
    }


    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + "!" + "!".repeat(volume));
        }

    }
}
