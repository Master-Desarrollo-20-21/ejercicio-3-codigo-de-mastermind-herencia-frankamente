public class SecretCombination extends Combination {

    private final boolean SHOW_SECRET_COMBINATION = true;
    private final String SECRET_COMBINATION = "XXXX";

    SecretCombination(String combination) {
        super(combination);
    }

    @Override
    public String toString() {
        if (!SHOW_SECRET_COMBINATION) {
            return SECRET_COMBINATION;
        }
        return combination;
    }
}
