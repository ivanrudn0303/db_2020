package homework.riddle_game;

import design_patterns.template_method.Game;

import javax.swing.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RiddleGame implements Game {

    //todo

    private final int maxLimit;
    private int answer;

    public RiddleGame(int max) {
        this.maxLimit = max;

    }

    public static void main(String[] args) {

        int maximum = Integer.parseInt(JOptionPane.showInputDialog("set number limits"));
        RiddleGame riddleGame = new RiddleGame(maximum);
        riddleGame.play();
    }




    @Override
    public void play() {
        generateAnswer();
        int guess;
        int attempts = 0;
        do {
            attempts++;
            guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess"));
        } while (!correctGuess(guess));
        System.out.println("Good job. It took just " + attempts + " attempts");
    }

    private void generateAnswer() {
        Random rn = new Random();
        answer = rn.nextInt(this.maxLimit + 1);
        System.out.println(answer);
    }

    private boolean correctGuess(int guess) {
        return answer == guess;
    }
}





