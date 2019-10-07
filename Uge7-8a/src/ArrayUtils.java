public class ArrayUtils {
    public static String arrayToString(int[] a){
        String s = "";
        s += a[0];
        for (int i=1; i < a.length; i++) {
            s += " " + a[i];
        }
        return "{" + s + "}";
    }
    public static int occurences(int[] a, int n){
        int count = 0;
        for (int i=0; i < a[i]; i++) {
            if (a[i] == n){
                count +=1;
            }
        }
        return count;
    }
    public static int sum(int[] a){
        int length = 0;
        for (int i:a) {
            length += i;
        }
        return length;
    }
}
