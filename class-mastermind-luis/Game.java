import java.util.Arrays;

public class Game {

    private static final int MAX_ATTEMPTS = 6;
    private final SecretCombination secretCombination;
    private final Attempt[] attemps;

    Game() {
        secretCombination = new SecretCombination("rgbp");
        attemps = new Attempt[MAX_ATTEMPTS];
    }

    public void play() {
        int actualAttempt = 0;
        do {
            System.out.println(secretCombination);
            attemps[actualAttempt] = new Attempt(secretCombination, obtainValidProposedCombination());
            if (!attemps[actualAttempt].isWinner()) {
                System.out.println("Incorrecto: " + attemps[actualAttempt].getResult());
                System.out.println("Quedan " + (MAX_ATTEMPTS - actualAttempt - 1) + " intentos.");
            }
            actualAttempt++;
        } while (!attemps[actualAttempt - 1].isWinner() && !attemptsEnded(actualAttempt));
        if (!attemptsEnded(actualAttempt)) {
            System.out.println("Has ganado.");
        } else {
            System.out.println("Has perdido porque has consumido todos los intentos");
        }
    }

    private ProposedCombination obtainValidProposedCombination() {
        boolean validCombination = false;
        ProposedCombination proposedCombination = null;
        do {
            final String proposedCombinationString = new Console().readString("Introduce la combinación: ");
            if (proposedCombinationString == null || proposedCombinationString.isEmpty()) {
                System.out.println("La combinación no puede ser vacía");
                continue;
            }
            if (proposedCombinationString.length() != Combination.LENGTH) {
                System.out.println("La combinación debe tener una longitud de " + Combination.LENGTH + " caracteres.");
                continue;
            }
            proposedCombination = new ProposedCombination(proposedCombinationString);
            if (!proposedCombination.isValid()) {
                System.out.println("La combinación propuesta solo puede contener los siguientes caracteres una vez: " + Arrays.toString(Color.values()));
                continue;
            }
            validCombination = true;
        } while (!validCombination);
        return proposedCombination;
    }

    private boolean attemptsEnded(int actualAttempt) {
        return actualAttempt >= MAX_ATTEMPTS;
    }
}
