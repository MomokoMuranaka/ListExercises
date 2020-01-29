import java.util.ArrayList;
import java.util.List;

public class Perfects {

    private List<Integer> perfectsList;

    public Perfects(Integer num){
        this.perfectsList = new ArrayList<>();

        for(Integer i = 1; i <= num; i++ ) {
            if(isPerfect(i)){
                this.perfectsList.add(i);
            }
        }
    }

    public List<Integer> get(){
        return this.perfectsList;
    }

    private boolean isPerfect(Integer num){
        Integer sum = 0;
        List<Integer> factorsList = new Factors(num).get();

        for(Integer i = 0; i < factorsList.size(); i++){
            if(factorsList.get(i) != num) {
                sum += factorsList.get(i);
            }
        }

        return sum == num;
    }
}
