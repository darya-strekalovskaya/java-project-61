package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final int MIN_RANDOM_NUMBER = -100;
    private static final int MAX_RANDOM_NUMBER = 100;

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (var n = 2; n <= (number / 2); n += 1) {
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }

    public static void startGamePrime() {

        final int firstStepOfGame = 0;

        String[][] questionsAndAnswers = new String[Engine.MAX_STEP_OF_GAME][2];

        for (var i = firstStepOfGame; i < Engine.MAX_STEP_OF_GAME; i += 1) {
            int currentRandomNumber = Utils.generateRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            String rightAnswer = isPrime(currentRandomNumber) ? "yes" : "no";
            questionsAndAnswers[i][0] = Integer.toString(currentRandomNumber);
            questionsAndAnswers[i][1] = rightAnswer;
        }

        Engine.game(DESCRIPTION, questionsAndAnswers);

    }
}
