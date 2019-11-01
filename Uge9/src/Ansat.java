public class Ansat extends Person {
    private String institutnavn;
    public Ansat(String navn, String institutnavn){
        super(navn);
        this.institutnavn = institutnavn;
    }

    public void setInstitutnavn(String institutnavn) {
        this.institutnavn = institutnavn;
    }
    public String getInstitutnavn(){
        return this.institutnavn;
    }
    @Override
    public String toString(){
        return "class Ansat\n\t[navn="+getNavn()+"]" +
                "\n\t[institutnavn="+getInstitutnavn()+"]";
    }
}