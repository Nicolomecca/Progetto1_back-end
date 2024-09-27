package Multimedia;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = Math.max(durata, 1);
        this.volume = Math.max(volume, 1);
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }

    public void abbassaVolume() {
        volume = Math.max(volume - 1, 0);
    }

    public void alzaVolume() {
        volume++;
    }
}