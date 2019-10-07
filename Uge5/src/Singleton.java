public class Singleton {
    private static Singleton single_instant = null;
    public String s;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if (single_instant == null){
            single_instant = new Singleton();
        }
        return single_instant;
    }
    public void setString(String s){
        this.s = s;
    }
}
