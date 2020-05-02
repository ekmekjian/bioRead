import java.util.Map;
import java.util.HashMap;

public class  NucleotideCounter{
    private String dna;
    Map<Character,Integer> defaultMap=Map.of('A', 0, 'C', 0, 'G', 0, 'T', 0);;
    Map<Character,Integer> counter;
    NucleotideCounter(String s)
    {
        counter  = new HashMap<>(defaultMap);
        if(!s.isEmpty()){
        exceptionCheck(s);
        this.dna =s;
        work();
        }
    }
    public Map<Character,Integer>nucleotideCounts()
    {
         return counter;
    }
    private void work()
    {
        char[] charArr = dna.toCharArray();
        for(char ch:charArr)
        {
            counter.put(ch,counter.get(ch)+1);
        }

    }
    void exceptionCheck(String s)
    {
        if(!s.matches("[ACGT]*"))
       throw new IllegalArgumentException();
    }
}