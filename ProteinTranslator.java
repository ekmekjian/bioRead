import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class ProteinTranslator {
    Map<String,String> protiens = new HashMap<String,String>();
   public ProteinTranslator(){CreateList();}

    List<String> translate(String rnaSequence) {
        String codon;   
        List<String> translation = new ArrayList<String>();
        for(int i = 0;i<rnaSequence.length()-2;i+=3)
        {
            codon = rnaSequence.substring(i, i+3);
            if(protiens.get(codon)=="STOP")
                return translation;
            translation.add(protiens.get(codon));
        }

        return translation;
    }
   
    void CreateList()
    {
        protiens.put("AUG", "Methionine");protiens.put("UAU", "Tyrosine");
        protiens.put("UUU", "Phenylalanine");protiens.put("UAC", "Tyrosine");
        protiens.put("UUC", "Phenylalanine");protiens.put("UGU", "Cysteine");
        protiens.put("UUA", "Leucine");protiens.put("UGC", "Cysteine");
        protiens.put("UUG", "Leucine");protiens.put("UGG", "Tryptophan");
        protiens.put("UCU", "Serine");protiens.put("UAA", "STOP");
        protiens.put("UCC", "Serine");protiens.put("UAG", "STOP");
        protiens.put("UCA", "Serine");protiens.put("UGA", "STOP");
        protiens.put("UCG", "Serine"); 
    }
    public static void main (String[]args)
    {
        ProteinTranslator tester = new ProteinTranslator();
        tester.translate("AUGUUUUGG");
    }
}