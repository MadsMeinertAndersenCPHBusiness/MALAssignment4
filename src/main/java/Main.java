public class Main {
    public static void main(String[] args) {
//        String actions = "acdde";
//        Automaton workingAutomaton = new Automaton(actions);
//        State state = workingAutomaton.state();

        String defectActions = "acddddddeaa";
        Automaton defectAutomation = new Automaton(defectActions);
        State defectState = defectAutomation.getState();

//        for (char cha: actions.toCharArray()) {
//            if (state == null) System.out.println(cha + " not an action");
//            state = workingAutomaton.nextState(state, cha);
//        }

        for (char cha: defectActions.toCharArray()) {
            if (defectState == null) System.out.println(cha + " is an invalid action");
            defectState = defectAutomation.nextState(defectState, cha);
        }

    }
}
