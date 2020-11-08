public class Attempt {
    private final SecretCombination secretCombination;
    private final ProposedCombination proposedCombination;

    public Attempt(SecretCombination secretCombination, ProposedCombination proposedCombination) {

        this.secretCombination = secretCombination;
        this.proposedCombination = proposedCombination;
    }

    public boolean isWinner() {
        return false;
    }
}
