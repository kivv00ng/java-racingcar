package racingCar.domain;

import java.util.Objects;

public class Car {
    public static final int MOVE_CRITERIA = 4;
    public static final int MOVE_NUMBER_MINIMUM = 0;
    public static final int MOVE_NUMBER_MAXIMUM = 9;

    private Name name;
    private Position position;

    public Car() {
        this.position = new Position();
    }

    public Car(int position) {
        this.position = new Position(position);
    }

    public Car(String name) {
        this.name = Name.of(name);
        this.position = new Position();
    }

    public Car(String name, int position) {
        this.name = Name.of(name);
        this.position = new Position(position);
    }

    public String makeNameAndPosition() {
        return name + " : " + position.makePosition();
    }

    public void move(int number) {
        validateMoving(number);

        if (canMove(number)) {
            position = position.increase();
        }
    }

    public void validateMoving(int number) {
        if (!(MOVE_NUMBER_MINIMUM <= number && number <= MOVE_NUMBER_MAXIMUM)) {
            throw new IllegalArgumentException("number의 유효범위는 0~9입니다.");
        }

    }

    public boolean canMove(int randomNumber) {
        return (randomNumber >= MOVE_CRITERIA);
    }

    public Boolean isSamePosition(Position position) {
        return this.position.equals(position);

    }

    public Position maxPosition(Position maxPosition) {
        return position.maxPosition(maxPosition);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        return name + ", ";
    }


}
