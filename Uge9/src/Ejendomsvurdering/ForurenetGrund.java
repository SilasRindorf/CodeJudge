package Ejendomsvurdering;
public class ForurenetGrund extends Grund {
    private int fradrag;
    public ForurenetGrund(int grund, int kvadratmeterpris, int byggeret, int fradrag){
        super(grund,kvadratmeterpris,byggeret);
        this.fradrag = fradrag;
    }
    public int vurdering(){
        return areal * kvadratmeterpris + areal - fradrag;
    }
    public void sætFradag(int fradrag){
        this.fradrag = fradrag;
    }
}