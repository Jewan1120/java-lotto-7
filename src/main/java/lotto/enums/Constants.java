package lotto.enums;

public enum Constants {

    MONEY_UNIT(1000),
    ;

    private final int value;

    Constants(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}