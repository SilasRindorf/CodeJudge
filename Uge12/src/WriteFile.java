import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile{
    private BufferedWriter bw;
    public void openFile(String file) throws IOException {
        bw = new BufferedWriter(new FileWriter(file));
    }

    public void writeInts(int[] ints) throws IOException {
        int x = 0;
        for (int i : ints) {
            if(x < ints.length)
                bw.write(i + " ");
            else
                bw.write(i);
            x++;
        }
        bw.write("\n");
    }
    public void closeFile() throws IOException {
        this.bw.close();
    }
}