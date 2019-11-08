import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {
    private BufferedReader br;
    public void openFile(String file) {
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (Exception e){
            System.out.println("Filen kan ikke åbnes");
        }
    }
    public int[] ReadInts() throws IOException {
        int[] temp;
        int lines = 0;
        while (br.readLine() != null) lines++;
        temp = new int[lines];
        int i = 0;
        for (String line; (line = br.readLine()) != null; ) {
            temp[i] = Integer.parseInt(line);
            i++;
        }
        return temp;
    }
    public void closeFile() throws IOException {
        this.br.close();
    }

}