public enum Color {
    Red('r'),
    Blue('b'),
    Green('g'),
    Yellow('y'),
    Purple('p'),
    Orange('o');

    private final char color;

    Color(char color) {

        this.color = color;
    }

    public char asChar() {
        return color;
    }

    @Override
    public String toString() {
        return String.valueOf(color);
    }
}
