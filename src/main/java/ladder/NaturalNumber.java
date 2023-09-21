package ladder;

public class NaturalNumber {

    private final int number;

    public NaturalNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static NaturalNumber of(int number) {
        return new NaturalNumber(number);
    }

    private void validate(int number) {
        if (!isNaturalNumber(number)) {
            throw new IllegalArgumentException();
        }
    }

    private static boolean isNaturalNumber(int number) {
        return number >= 1;
    }
}