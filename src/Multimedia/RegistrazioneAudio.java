package Multimedia;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;

    // Creo una nuova RegistrazioneAudio fornendo titolo, durata e volume
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);

        this.durata = Math.max(durata, 1); // Assegno la durata, ma se è minore di 1 la imposto a 1
        this.volume = Math.max(volume, 1);
    }

    // Riproduco la registrazione audio
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) { // Ripeto per la durata della registrazione
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }

    // Abbasso il volume della registrazione audio
    public void abbassaVolume() {
        volume = Math.max(volume - 1, 0);
    }

    // Alzo il volume della registrazione audio
    public void alzaVolume() {
        volume++;
    }
}