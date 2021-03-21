public class Alphabet {

    public int getIndex(char action){
        if (action < 'a' || action > 'e') throw new RuntimeException("Illegal action");
        return action - 'a';
    }



}
