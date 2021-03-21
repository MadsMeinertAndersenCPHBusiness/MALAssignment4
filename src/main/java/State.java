public class State {
    private int index;
    private boolean isFinal;

    public State(int index, boolean isFinal) {
        this.index = index;
        this.isFinal = isFinal;
    }

    public int getIndex() {
        return index;
    }

    public boolean isFinal() {
        return isFinal;
    }
}
