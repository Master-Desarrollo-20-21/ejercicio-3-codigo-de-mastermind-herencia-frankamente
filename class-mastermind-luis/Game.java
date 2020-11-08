public class Game {

    private static final int MAX_ATTEMPTS = 6;
    private final SecretCombination secretCombination;
    private final Attempt[] attemps;

    Game() {
        secretCombination = new SecretCombination();
        attemps = new Attempt[MAX_ATTEMPTS];
    }

    public void play() {
        int actualAttempt = 0;
        do {
            attemps[actualAttempt] = new Attempt(secretCombination, new ProposedCombination());
            actualAttempt++;
        } while (!attemps[actualAttempt - 1].isWinner() || attemptsEnded(actualAttempt));
        if (attemptsEnded(actualAttempt)) {
            System.out.println("Has ganado.");
        } else {
            System.out.println("Has perdido.");
        }
    }

    private boolean attemptsEnded(int actualAttempt) {
        return actualAttempt < MAX_ATTEMPTS;
    }
}
