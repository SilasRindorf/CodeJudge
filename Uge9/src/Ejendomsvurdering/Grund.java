package Ejendomsvurdering;
public class Grund {
    protected int byggeret;
    protected int kvadratmeterpris;
    protected int areal;
    public Grund(int grund, int kvadratmeterpris,int byggeret){
        this.areal = grund;
        this.kvadratmeterpris = kvadratmeterpris;
        this.byggeret = byggeret;
    }
    public int vurdering(){
        return areal * kvadratmeterpris + byggeret;
    }
}
