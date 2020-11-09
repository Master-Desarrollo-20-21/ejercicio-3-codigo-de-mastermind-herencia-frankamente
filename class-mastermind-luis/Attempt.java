public class Attempt {
    private final Combination secretCombination;
    private final Combination proposedCombination;

    public Attempt(Combination secretCombination, Combination proposedCombination) {

        this.secretCombination = secretCombination;
        this.proposedCombination = proposedCombination;
    }

    public boolean isWinner() {
        return secretCombination.equals(proposedCombination);
    }

    public String getResult() {
        final char[] proposedCombinationPegs = proposedCombination.combination.toCharArray();
        int blacks = 0;
        int whites = 0;
        for (int i = 0; i < proposedCombinationPegs.length; i++) {
            final char[] secretCombinationPegs = secretCombination.combination.toCharArray();
            if (secretCombinationPegs[i] == proposedCombinationPegs[i]) {
                blacks++;
                continue;
            }
            if (String.valueOf(secretCombinationPegs).contains(String.valueOf(proposedCombinationPegs[i]))) {
                whites++;
            }
        }
        return "Blacks: " + blacks + " Whites: " + whites;
    }
}
