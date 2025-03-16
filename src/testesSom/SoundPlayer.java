package testesSom;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundPlayer {
    public static void main(String[] args) {
        try {
            // Carrega o arquivo de áudio
            File audioFile = new File("C:\\Users\\Caio\\Documents\\FATEC\\T3\\POO\\Eclipse\\pooTeste\\src\\testesSom\\audio.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            // Cria um Clip de áudio
            Clip clip = AudioSystem.getClip();

            // Abre o áudio e carrega no Clip
            clip.open(audioStream);

            // Reproduz o áudio
            clip.start();

            // Aguarda até que o áudio termine de ser reproduzido
            while (!clip.isRunning())
                Thread.sleep(10);
            while (clip.isRunning())
                Thread.sleep(10);

            // Fecha o Clip
            clip.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}