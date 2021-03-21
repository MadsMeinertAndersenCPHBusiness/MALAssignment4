import java.sql.Timestamp;
import java.util.ArrayList;

public class Automaton {

    private Alphabet alphabet = new Alphabet();
    private ArrayList<State> statesArray = new ArrayList<>();
    private State[][] states;
    private State state;
    private static Log log = new Log();

    public Automaton(String actions) {
        statesArray.add(state = new State(0, false));
        for (int index = 1; index <= 4; index++) {
            if (index == 4) {statesArray.add(new State(index, true));
            }else
            statesArray.add(new State(index, false));
        }
        states = new State[statesArray.size()][5];

        states[0][alphabet.getIndex('a')] = statesArray.get(1);
        states[1][alphabet.getIndex('b')] = statesArray.get(2);
        states[1][alphabet.getIndex('c')] = statesArray.get(3);
        states[3][alphabet.getIndex('d')] = statesArray.get(3);
        states[3][alphabet.getIndex('e')] = statesArray.get(4);
        states[2][alphabet.getIndex('e')] = statesArray.get(4);

    }

    public State getState(){
        return state;
    }
    public State nextState(State state, char cha){


        State currentState = states[state.getIndex()][alphabet.getIndex(cha)];

        log.setTimestamp(new Timestamp(System.currentTimeMillis()));


        if (states[state.getIndex()] [alphabet.getIndex(cha)] == null){
            log.setLevel(Level.ERROR);
        }else if(currentState.isFinal()){
        log.setLevel(Level.WARNING);
        }
        log.setAction(cha);
        System.out.println(log.toString());

        return states[state.getIndex()] [alphabet.getIndex(cha)];

    }
}
