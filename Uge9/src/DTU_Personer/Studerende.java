package DTU_Personer;

public class Studerende extends Person {
    private String studienummer;
    public Studerende(String navn, String studienummer){
        super(navn);
        this.studienummer = studienummer;
    }
    public String getStudienummer() {
        return studienummer;
    }
    public void setStudienummer(String studienummer) {
        this.studienummer = studienummer;
    }
    @Override
    public String toString() {
        return "class Studerened\n\t[navn="+getNavn()+"]" +
                "\n\t[studienummer="+studienummer+"]";
    }
}