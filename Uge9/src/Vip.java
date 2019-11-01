public class Vip extends Ansat {
    private String[] kurser;

    public Vip(String navn, String institutnavn, String[] kurser) {
        super(navn, institutnavn);
        this.kurser = kurser;
    }

    public String[] getKurser() {
        return kurser;
    }

    public void setKurser(String[] kurser) {
        this.kurser = kurser;
    }

    @Override
    public String toString() {
        System.out.print("class Vip\n\t[navn=" + getNavn() + "]" +
                "\n\t[institutnavn=" + getInstitutnavn() + "]");
        for (String kursus : getKurser()) {
            System.out.print("\n\t[kursus=" + kursus + "]");
        }
        return "";
    }
}