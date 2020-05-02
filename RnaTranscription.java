/*
    G -> C
    C -> G
    T -> A
    A -> U
 */


class RnaTranscription {

    String transcribe(String dnaStrand) {
        String translation="";
        if(dnaStrand.isEmpty())return translation;
        char[] characters = dnaStrand.toCharArray();
		for(char ch : characters) {
			translation += reference.valueOf(String.valueOf(ch)).getValue();
		}
        return translation;
    }
    enum reference{
        G('C'),C('G'),T('A'),A('U');
    char value;
    reference(char value)
    {
        this.value=value;
    }
    public char getValue(){
        return this.value;
    }
    }
}
