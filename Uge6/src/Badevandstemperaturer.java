public class Badevandstemperaturer {
    public static void main(String[] args) {
        System.out.println("Maksimum: " + maks(args));
        System.out.println("Antal fald: " + antalfald(args));
    }
    private static int maks(String[] badetempS){
        int[] badetemp = new int[badetempS.length];
        for (int i = 0; i < badetemp.length; i++){
            badetemp[i] = Integer.parseInt(badetempS[i]);
        }
        int maks = badetemp[0];
        for (int value : badetemp) {
            if (maks < value) {
                maks = value;
            }
        }
        return maks;
    }
    private static int antalfald(String[] badetempS){
        int drop = 0;
        int[] badetemp = new int[badetempS.length];
        for (int i = 0; i < badetemp.length; i++){
            badetemp[i] = Integer.parseInt(badetempS[i]);
        }
        for (int i=0; i < badetemp.length-1; i++){
            if (badetemp[i+1] < badetemp[i]){
                drop += 1;
            }
        }
        return drop;
    }
}
