package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void startGameEven() {

        final int firstStepOfGame = 0;

        String[][] questionsAndAnswers = new String[Engine.MAX_STEP_OF_GAME][2];

        for (var i = firstStepOfGame; i < Engine.MAX_STEP_OF_GAME; i += 1) {
            int currentRandomNumber = Utils.generateRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            questionsAndAnswers[i][0] = Integer.toString(currentRandomNumber);
            questionsAndAnswers[i][1] = isEven(currentRandomNumber) ? "yes" : "no";
        }

        Engine.game(DESCRIPTION, questionsAndAnswers);

    }
}
