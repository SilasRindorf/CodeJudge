import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        WriteFile wf = new WriteFile();
        wf.openFile("test.txt");
        wf.writeInts(new int[]{1,2,3,4,5});
        wf.writeInts(new int[]{5,4,3,2,1});
        wf.closeFile();
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        System.out.println(bf.readLine());
        System.out.println(bf.readLine());
    }
}
