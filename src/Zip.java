import java.util.ArrayList;
import java.util.List;

public class Zip{

    private List<Pair> zipList;

    public Zip(List first, List second){

        this.zipList = new ArrayList<>();

        for(Integer i = 0; i < (Math.min(first.size(), second.size())); i++){

            this.zipList.add(new Pair<>(first.get(i), second.get(i)));
        }
    }

    public List get(){
        return zipList;
    }

}
