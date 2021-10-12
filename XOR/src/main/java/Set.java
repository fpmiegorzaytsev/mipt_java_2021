import java.util.ArrayList;

public class Set<T> extends ArrayList {

    public static <T> Set<T> symmetricDifference(Set <? extends T> set1, Set <? extends T> set2){
        Set<T> set = new Set<>();
        for (int i = 0; i < set1.size() ; i++) {
            if(!set2.contains(set1.get(i))){
                set.add(set1.get(i));
            }
        }
        for (int i = 0; i < set2.size() ; i++) {
            if(!set1.contains(set2.get(i))){
                set.add(set2.get(i));
            }
        }
        return set;
    }
}

