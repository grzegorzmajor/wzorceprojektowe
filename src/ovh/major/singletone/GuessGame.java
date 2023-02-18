package ovh.major.singletone;

import java.io.Serial;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class GuessGame implements Serializable {
    @Serial
    private static final long serialVersionUID = 234545;
    private static GuessGame instance;
    private int score;

    private GuessGame() {
        this.score = 0;
    }

    public void play() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int liczba;
        for (int i =0;i<10;i++) {
            do {
                System.out.print("Jaką liczbę od 0 do 9 mam na myśli? Zgadniesz? Liczba: ");
                liczba = scanner.nextInt();
                if (scanner.hasNextLine()) scanner.nextLine();
            } while (liczba < 0 || liczba > 9 );
            if (liczba == Math.floor(random.nextDouble() * 9)) {
                this.score++;
                System.out.println("Trafiłeś!");
            } else {
                System.out.println("Pudło!");
            }
        }
        System.out.println("Wynik: " + this.score);
    }

    public static GuessGame getInstance() {
        if (instance == null) {
            synchronized (GuessGame.class) {
                if (instance == null) {
                    instance = new GuessGame();
                }
            }
        }
        return instance;
    }

    public int getScore() {
        return score;
    }

    @Serial
    protected Object readResolve() {
        return instance;
    }
}
