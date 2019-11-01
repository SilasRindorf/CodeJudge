public class Person {
    private String navn;
    public Person(String navn) {
        this.navn = navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }
    public String getNavn(){
        return this.navn;
    }
    @Override
    public String toString() {
        return "class Person\n\t[navn="+getNavn()+"]";
    }
}
