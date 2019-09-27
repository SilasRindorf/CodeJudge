public class Skat {
    public static void main(String[] args) {
        int indkomst = 120000;
        double ambi, pension, bundskat;
        ambi = indkomst * 8.0f / 100.0f;
        pension = indkomst * 1.0f / 100.0f;
        bundskat = (indkomst - ambi - pension - 33400f) * 7.0f / 100f;
        System.out.print("Arbejdsmarkedsbidrag: ");
        System.out.println(ambi);
        System.out.print("Særlig pensionsopsparing: ");
        System.out.println(pension);
        System.out.print("Bundskat: ");
        System.out.println(bundskat);
    }
}