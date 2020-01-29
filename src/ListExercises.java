import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExercises{
    public static void main(String[] args){

        //Ex1:二つのリスト（任意のタイプ）を受け取り、それぞれのリストの対応する要素をペア（Pair）とするリストを返すメソッドを作りなさい。
        List first = Arrays.asList(1,2,3,4);
        List second = Arrays.asList("a","b","c","d","e");
        List<Pair> zipList = new Zip(first, second).get();
        System.out.println("--------1,2,3,4とa,b,c,d,eのペアのリスト---------");
        for(Integer i= 0; i < zipList.size(); i++){
            System.out.println(zipList.get(i).getFirstValue() + "," + zipList.get(i).getSecondValue());
        }

        //Ex2 与えられた数の約数を求めてリストとして返すメソッドを作成せよ。
        List<Integer> factorsList = new Factors(500).get();
        System.out.println("--------500の約数---------");
        for(Integer i = 0; i < factorsList.size(); i++){
            System.out.println(factorsList.get(i));
        }

        //Ex3 与えられた数を上限とし、その数までの完全数の一蘭をリストとして返すメソッドを作成せよ。
        List<Integer> perfectsList = new Perfects(500).get();
        System.out.println("--------500までの完全数---------");
        for(Integer i = 0; i < perfectsList.size(); i++){
            System.out.println(perfectsList.get(i));
        }

        //Ex4 任意のタイプのリストを受け取り、隣あう要素をペア（Pair）として返すメソッドを作成せよ。
        List intList = Arrays.asList(1,2,3,4,5,6);
        List<Pair> intPairsList = new Pairs(intList).get();
        System.out.println("--------1,2,3,4,5,6のPairsリスト---------");
        for(Integer i= 0; i < intPairsList.size(); i++){
            System.out.println(intPairsList.get(i).getFirstValue() + "," + intPairsList.get(i).getSecondValue());
        }

        List strList = Arrays.asList("a","b","c","d","e");
        List<Pair> strPairsList = new Pairs(strList).get();
        System.out.println("--------a,b,c,d,eのPairsリスト---------");
        for(Integer i= 0; i < strList.size()-1; i++){
            System.out.println(strPairsList.get(i).getFirstValue() + "," + strPairsList.get(i).getSecondValue());
        }

        //Ex5 与えられた整数のリストが、昇順にソートされていればtrueを返し、そうでなければfalseを返すメソッドを追加せよ。
        List intList2 = Arrays.asList(1,2,3,4,5,6);
        System.out.println("--------sorted?---------");
        System.out.println(sorted(intList2));

        //Ex6 任意の型のリストと、その型の値を受け取り、その値のリスト内の位置（インデックス）をリストとして返すメソッドを作成せよ。
        List strList2 = Arrays.asList("a","b","c","d","a");
        List<Integer> positionsList = positions("a", strList2);
        System.out.println("--------aのpositions---------");
        for(Integer i= 0; i < positionsList.size(); i++){
            System.out.println(positionsList.get(i));
        }

    }

    private static boolean sorted(List<Integer> list){

        for(Integer i= 0; i < list.size() - 1; i++){
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;
    }

private static <T> List<Integer> positions(T t, List list){

        List<Integer> positionsList = new ArrayList<>();
        for(Integer i= 0; i < list.size(); i++){
            if(list.get(i).equals(t)){
                positionsList.add(i);
            }
        }
        return positionsList;
    }

}

