package racingCar.domain;

import java.util.Objects;

public class Position {
    public static final int INITIAL_VALUE = 1;
    public static final int POSITION_MINIMUM = 0;
    public static final int INCREASE_UNIT = 1;

    private final int position;

    public Position() {
        this.position = INITIAL_VALUE;
    }

    public Position(int position) {
        if (position < POSITION_MINIMUM) {
            throw new IllegalArgumentException("position 값은 0 미만이 될 수 없습니다.");
        }
        this.position = position;
    }

    public String makePosition() {
        String temporaryString = "";
        for (int i = 0; i < this.position; i++) {
            temporaryString += "-";
        }
        return temporaryString;
    }

    public Position increase() {
        return new Position(position + INCREASE_UNIT);
    }

    public Position maxPosition(Position maxPosition) {
        if (maxPosition.position <= this.position) {
            return this;
        }
        return maxPosition;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

}
