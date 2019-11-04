package Ejendomsvurdering;
public class Ejendom {
    private Bygning bygning;
    private Grund grund;
    public Ejendom(Bygning bygning, Ejendom ejendom){
        this.bygning = bygning;
        this.grund = grund;
    }
    public int vudering(){
        return bygning.vurdering() + grund.vurdering();
    }
}
