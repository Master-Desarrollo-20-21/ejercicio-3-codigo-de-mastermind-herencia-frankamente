import java.util.Arrays;

public class ProposedCombination extends Combination {

    ProposedCombination(String combination) {
        super(combination);
    }

    public boolean isValid() {
        boolean isValid = true;
        for (char combinationPeg : combination.toCharArray()) {
            if (Arrays.stream(Color.values()).noneMatch(x -> x.asChar() == combinationPeg)) {
                isValid = false;
                break;
            }
        }
        if (!isValid) {
            return false;
        }
        for (Color color : Color.values()) {
            final int occurrencesOfColor = combination.length() - combination.replaceAll(String.valueOf(color.asChar()), "").length();
            if (occurrencesOfColor > 1) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}
