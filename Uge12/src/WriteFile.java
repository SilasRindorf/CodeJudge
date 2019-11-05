import java.io.BufferedWriter;
import java.io.FileWriter;
public class WriteFile {
    private BufferedWriter br;
    public void openFile(String file){
        try{
            br = new BufferedWriter(new FileWriter(file));
        } catch (Exception e){
            System.out.println("Error: " + e);
        }

    }
    public void writeInts(int[] ints){
        try {
            for (int i : ints) {
                br.write(i);
            }
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
