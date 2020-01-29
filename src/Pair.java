public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second){
        this.first = first;
        this.second = second;
    }

    public F getFirstValue(){
        return first;
    }

    public S getSecondValue(){
        return second;
    }
}

