import java.util.ArrayList;
import java.util.List;

public class Pairs {

    private List<Pair> pairsList;

    public Pairs(List list){

        this.pairsList = new ArrayList<>();

        for(Integer i = 0; i < list.size() - 1; i ++){

            this.pairsList.add(new Pair<>(list.get(i), list.get(i + 1)));
        }
    }

    public List get(){
        return pairsList;
    }
}
