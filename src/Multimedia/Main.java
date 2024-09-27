package Multimedia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        ElementoMultimediale [] elementi = new ElementoMultimediale[5];
        // inizializzo gli elementi multimediali
        elementi [0] = new RegistrazioneAudio("Canzone 1",3,5);
        elementi [1] = new Video("Film 1",2,3,4);


    }
}