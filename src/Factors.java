import java.util.ArrayList;
import java.util.List;

public class Factors {

    private List<Integer> factorsList;

    public Factors(Integer num){
        this.factorsList = new ArrayList<>();
        for(Integer i = 1; i <=num; i++){
            if(num % i == 0){
                factorsList.add(i);
            }
        }
    }

    public List<Integer> get(){
        return this.factorsList;
    }
}
