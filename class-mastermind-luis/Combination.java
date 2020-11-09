import java.util.Objects;

public class Combination {
    public static final int LENGTH = 4;
    protected final String combination;

    Combination(String combination) {
        this.combination = combination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Combination that = (Combination) o;
        return Objects.equals(combination, that.combination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(combination);
    }
}
