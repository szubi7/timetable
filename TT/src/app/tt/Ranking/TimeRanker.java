package app.tt.Ranking;

import app.tt.Parts.Time;

import java.util.*;

/**
 * Created by daszabo on 2017.07.14..
 */
public class TimeRanker {
    /**
     * Az importálás után fel kell térképezni a lehetséges időpontokat. Ezeket el kell tárolni.
     * A user megállapítja a rangsort a megadott időpontok között.
     * Ezek lesznek a rangsor együtthatói (factor)
     */

    private static Set<Time> timeSet = new HashSet<>();
    private static List<Time> ranking = new LinkedList<>();

    /**
     * A FileReader által beolvasott értékek átadása a @timeSet-nek.
     */
    public void readTimes(){

    }

    public static List<Time> getRanking() {
        return ranking;
    }

    /**
     * Láncolt listába rendezi az időpontokat, rendezve.
     */
    public static List<Time> sort(){
        for(Time t : timeSet){
            for(int i=0;i<ranking.size();++i){
                if(t.compareFactor(ranking.get(i).getFactor())){
                    ranking.add(t);
                }
                //Ez nem biztos, hogy kell.
                if(ranking.get(i)==null){
                    ranking.add(t);
                }
            }
        }
        return ranking;
    }
}
