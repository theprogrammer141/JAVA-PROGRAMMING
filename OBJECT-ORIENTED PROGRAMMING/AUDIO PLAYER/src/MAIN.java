import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner=new Scanner(System.in);

        File file=new File("D:/GITHUB REPOS/JAVA-PROGRAMMING/OBJECT-ORIENTED PROGRAMMING/AUDIO PLAYER/src/videoplayback.wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        String response="";

        while(!response.equals("Q"))
        {
            System.out.println("P=PLAY , S=STOP , R=RESET , Q=QUIT");
            System.out.print("ENTER YOUR CHOICE:");
            response=scanner.next();
            response=response.toUpperCase();

            switch (response)
            {
                case"P": clip.start();
                break;
                case"S": clip.stop();
                break;
                case"R": clip.setMicrosecondPosition(0);
                break;
                case"Q": clip.close();
                break;
                default:
                    System.out.println("NOT A VALID RESPONSE!");
            }
        }
        System.out.println("BYE!");
    }
}
