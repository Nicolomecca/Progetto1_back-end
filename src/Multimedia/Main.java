package Multimedia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        // Initialize multimedia elements
        elementi[0] = new RegistrazioneAudio("Canzone 1", 3, 5);
        elementi[1] = new Video("Film 1", 2, 3, 4);
        elementi[2] = new Immagine("Immagine 1", 5);
        elementi[3] = new Video("Film 2", 3, 4, 2);
        elementi[4] = new RegistrazioneAudio("Canzone 2", 4, 2);

        int scelta = -1;

        while (scelta != 0) {
            System.out.println("Scegli un elemento da 1 a 5 (0 per uscire):");
            String input = scanner.nextLine();

            if (input.matches("\\d+")) {
                scelta = Integer.parseInt(input);

                if (scelta >= 1 && scelta <= 5) {
                    ElementoMultimediale elementoSelezionato = elementi[scelta - 1];

                    if (elementoSelezionato instanceof Immagine) {
                        ((Immagine) elementoSelezionato).show();
                    } else if (elementoSelezionato instanceof Riproducibile) {
                        ((Riproducibile) elementoSelezionato).play();
                        regolazioneComandi(scanner, elementoSelezionato);
                    }
                } else if (scelta != 0) {
                    System.out.println("Scelta non valida.");
                }
            } else {
                System.out.println("Input non valido. Inserisci un numero da 0 a 5:");
            }
        }

        System.out.println("Arrivederci!");
        scanner.close();
    }
    private static void regolazioneComandi(Scanner scanner, ElementoMultimediale elemento) {
        int action;
        do {
            System.out.println("1: Alza Volume | 2: Abbassa Volume | " +
                    "3: Aumenta Luminosità | 4: Diminuisci Luminosità | " +
                    "0: Torna al menu principale");
            action = Integer.parseInt(scanner.nextLine());

            if (elemento instanceof RegistrazioneAudio) {
                RegistrazioneAudio audio = (RegistrazioneAudio) elemento;
                switch (action) {
                    case 1:
                        audio.alzaVolume();
                        break;
                    case 2:
                        audio.abbassaVolume();
                        break;
                }
            } else if (elemento instanceof Video) {
                Video video = (Video) elemento;
                switch (action) {
                    case 1:
                        video.alzaVolume();
                        break;
                    case 2:
                        video.abbassaVolume();
                        break;
                    case 3:
                        video.aumentaLuminosita();
                        break;
                    case 4:
                        video.diminuisciLuminosita();
                        break;
                }
            }
        } while (action != 0);
    }
    }
