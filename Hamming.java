
class Hamming {
    String right,left;

    Hamming(String leftStrand, String rightStrand) {
        
        if(leftStrand.isEmpty()&&!rightStrand.isEmpty())
            throw new IllegalArgumentException("left strand must not be empty.");
        if(rightStrand.isEmpty()&&!leftStrand.isEmpty())
            throw new IllegalArgumentException("right strand must not be empty.");
        if(leftStrand.length()>rightStrand.length()||rightStrand.length()>leftStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        
        right = rightStrand;
        left = leftStrand;
    }

    int getHammingDistance() {
        if(right.isEmpty()&&left.isEmpty()){return 0;}
       int distance =0;
        for(int i=0;i<right.length();i++)
        {
            if(right.charAt(i)!=left.charAt(i)){distance++;}
        }
        
        return distance;
    }
}