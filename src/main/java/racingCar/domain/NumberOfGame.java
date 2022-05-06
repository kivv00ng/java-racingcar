package racingCar.domain;

public final class NumberOfGame {
    public static final int GAME_OVER_NUMBER = 0;
    public static final int DECREASE_UNIT = 1;

    private final int numberOfGame;

    public NumberOfGame(int numberOfGame) {
        this.numberOfGame = numberOfGame;
    }

    public boolean isEndGame() {
        return this.numberOfGame == GAME_OVER_NUMBER;
    }

    public NumberOfGame decreaseNumberOfGame() {
        return new NumberOfGame(numberOfGame - DECREASE_UNIT);
    }

    public boolean checkNumberOfGame(int numberOfGame) {
        return this.numberOfGame == numberOfGame;
    }
}
