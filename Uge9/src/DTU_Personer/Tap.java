package DTU_Personer;

public class Tap extends Ansat {
    private int arbejdstid;
    public Tap(String navn, String institutnavn,int arbejdstid){
        super(navn,institutnavn);
        this.arbejdstid = arbejdstid;
    }
    @Override
    public String toString(){
        return "class DTU_Personer.Tap\n\t[navn="+getNavn()+"]" +
                "\n\t[institutnavn="+getInstitutnavn()+"]" +
                "\n\t[arbejdstid="+arbejdstid+"]";
    }
}