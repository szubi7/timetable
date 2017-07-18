package app.tt.Ranking;

import app.tt.Parts.Teacher;
import app.tt.Parts.Time;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by daszabo on 2017.07.14..
 */
public class TeacherRanker {
    /**
     * A tanárokat az importálás után kell feltölteni
     */

    private static Set<Teacher> teacherSet = new HashSet<>();
    private static List<Teacher> ranking = new LinkedList<>();

    /**
     * A FileReader által beolvasott értékek átadása a @timeSet-nek.
     */
    public void readTeachers(){

    }

    public static List<Teacher> getRanking() {
        return ranking;
    }

    /**
     * Láncolt listába rendezi a tanárokat, rendezve.
     */
    public static List<Teacher> sort(){
        for(Teacher t : teacherSet){
            for(int i=0;i<ranking.size();++i){
                if(t.compareTo(ranking.get(i))==1){
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
